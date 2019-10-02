package cn.train.service;

import cn.train.enity.*;
import cn.train.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    TrainModelMapper trainModelMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;
    @Autowired
    MapTrainInfoMapper mapTrainInfoMapper;
    @Autowired
    MapStopInfoMapper mapStopInfoMapper;
    @Autowired
    SeatInfoMapper seatInfoMapper;
    @Autowired
    TrainInfoMapper trainInfoMapper;
    @Autowired
    StopInfoMapper stopInfoMapper;
    @Autowired
    UnsoldTicketMapper unsoldTicketMapper;
    @Autowired
    MapCityInfoMapper mapCityInfoMapper;

    public float CalculatePrice(int[] path,int m,int n){
        System.out.println("开始计算价格...");
        System.out.println(path[0]+"-"+path[path.length-1]);
        float[] prices = new float[path.length-1];
        float price = 0;

        MapCityInfo mapCityInfo = new MapCityInfo();
        for(int i=m;i<n;i++){
            mapCityInfo.setCityid1(path[i]);
            mapCityInfo.setCityid2(path[i+1]);
            float tmp = mapCityInfoMapper.getPriceByCityid(mapCityInfo);
            System.out.println(tmp);
            price += tmp;
        }
        return price;
    }

    @Override
    public List<MapTrainInfo> getAllTrainInfo() {

        List<MapTrainInfo> list = mapTrainInfoMapper.getAll();
        for (int i=0;i< list.size();i++){
            list.get(i).setTrainModel(trainModelMapper.selectByPrimaryKey(list.get(i).getModelid()));
            list.get(i).setFirstcity(cityInfoMapper.selectByPrimaryKey(list.get(i).getFirststation()));
            list.get(i).setLastcity(cityInfoMapper.selectByPrimaryKey(list.get(i).getLaststation()));
        }
        return list;
    }

    //生成日期对应的车次
    @Override
    public int generateDateTrain(String date)
    {
//    {System.out.println(date);
//    return 1;

        int result = 0;

        //读取运行图所有车次的信息
        List<MapTrainInfo> mapTrainInfoList = mapTrainInfoMapper.getAll();

        //开始循环处理每条列车信息
        for(int i= 0;i<mapTrainInfoList.size();i++){
            System.out.println("第" + (i+1) + "条列车信息：" + mapTrainInfoList.get(i));
            //获得经停信息
            List<MapStopInfo> mapStopInfoList = mapStopInfoMapper.getMapStopByTrainid(mapTrainInfoList.get(i).getId());
            List<SeatInfo> seatInfoList = seatInfoMapper.getSeatInfoByModelid(mapTrainInfoList.get(i).getModelid());

            //开始生成信息
            TrainInfo trainInfo = new TrainInfo();
            trainInfo.setChangetime(0);
            trainInfo.setStatus(1);
            trainInfo.setStopnumber(mapTrainInfoList.get(i).getStopnumber());
            trainInfo.setNumber(mapTrainInfoList.get(i).getNumber());
            trainInfo.setDay(date);
            trainInfo.setFirststation(mapTrainInfoList.get(i).getFirststation());
            trainInfo.setLaststation(mapTrainInfoList.get(i).getLaststation());
            trainInfo.setModelid(mapTrainInfoList.get(i).getModelid());

            //插入列车信息表，获取trainid
            trainInfoMapper.insert(trainInfo);
            int trainid = trainInfoMapper.getTrainidByTrainInfo(trainInfo);

            //收集路径，用于计算票价
            int[] stoppath = new int[mapStopInfoList.size()];

            //处理经停站信息
            for (int j=0;j<mapStopInfoList.size();j++){
                stoppath[j] = mapStopInfoList.get(j).getCityid();

                StopInfo stopInfo = new StopInfo();
                stopInfo.setTrainid(trainid);
                stopInfo.setCityid(mapStopInfoList.get(j).getCityid());
                stopInfo.setArrive(mapStopInfoList.get(j).getArrive());
                stopInfo.setParktime(mapStopInfoList.get(j).getParktime());
                stopInfo.setlefts(mapStopInfoList.get(j).getLefts());
                stopInfo.setNumber(mapStopInfoList.get(j).getNumber());
                stopInfo.setTicketgate(mapStopInfoList.get(j).getTicketgate());
                stopInfoMapper.insert(stopInfo);
            }

            int fromstopid = stopInfoMapper.selectMinidByTrainid(trainid);
            int tostopid = stopInfoMapper.selectMaxidByTrainid(trainid);

            //计算票价信息
            System.out.println(stoppath[0] +"  " +stoppath[mapStopInfoList.size()-1]);
            float price = CalculatePrice(stoppath,0,mapStopInfoList.size()-1);

            //处理车票信息
            System.out.println("开始处理车票信息..");
            for (int j = 0 ; j < seatInfoList.size() ; j++){
                System.out.println("第" + (j+1) + "张车票处理中...");
                UnsoldTicket unsoldTicket = new UnsoldTicket();
                unsoldTicket.setSeatlevel(seatInfoList.get(j).getSeatlevel());
                unsoldTicket.setSeatnumber(seatInfoList.get(j).getSeatnumber());
                unsoldTicket.setTrainid(trainid);
                unsoldTicket.setPrice(price);
                unsoldTicket.setFromstopid(fromstopid);
                unsoldTicket.setTostopid(tostopid);
                unsoldTicket.setRownumber(seatInfoList.get(j).getRownumber());
                unsoldTicket.setCarnumber(seatInfoList.get(j).getCarnumber());
                unsoldTicketMapper.insert(unsoldTicket);
            }
        }
        result = 1;
        return result;
    }
}
