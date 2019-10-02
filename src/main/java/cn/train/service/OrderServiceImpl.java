package cn.train.service;

import cn.train.enity.OrderInfo;
import cn.train.enity.SoldTicket;
import cn.train.enity.StopInfo;
import cn.train.enity.TrainInfo;
import cn.train.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderInfoMapper orderInfoMapper;
    @Autowired
    SoldTicketMapper soldTicketMapper;
    @Autowired
    StopInfoMapper stopInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;
    @Autowired
    ContactInfoMapper contactInfoMapper;
    @Autowired
    TrainInfoMapper trainInfoMapper;

    public List<OrderInfo> getTicketInfo(List<OrderInfo> result){
        for(int i=0;i<result.size();i++){
            //每个订单填充数据
            List<SoldTicket> temp = new ArrayList<SoldTicket>();
            temp = soldTicketMapper.selectByOrderid(result.get(i).getId());
            for (int j=0;j<temp.size();j++){
                //每张车票填充数据
                TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(temp.get(j).getTrainid());
                StopInfo m = stopInfoMapper.selectByPrimaryKey(temp.get(j).getTostopid());
                m.setCityInfo(cityInfoMapper.selectByPrimaryKey(m.getCityid()));
                StopInfo n = stopInfoMapper.selectByPrimaryKey(temp.get(j).getFromstopid());
                n.setCityInfo(cityInfoMapper.selectByPrimaryKey(n.getCityid()));
                temp.get(j).setTrainInfo(trainInfo);
                temp.get(j).setTostop(m);
                temp.get(j).setFromstop(n);
                temp.get(j).setContactInfo(contactInfoMapper.selectByPrimaryKey(temp.get(j).getContactid()));
            }
            result.get(i).setTickets(temp);
        }
        return result;
    }

    @Override
    public List<OrderInfo> getAllOrderByuserid(int userid) {
        List<OrderInfo> result = new ArrayList<OrderInfo>();
        result = orderInfoMapper.getAllOrder(userid);
        result = getTicketInfo(result);
        return result;
    }

    @Override
    public List<OrderInfo> getUndoneOrder(int userid) {
        List<OrderInfo> result = new ArrayList<OrderInfo>();
        result = orderInfoMapper.getUndoneOrder(userid);
        result = getTicketInfo(result);
        return result;
    }

    @Override
    public List<OrderInfo> getUnusedOrder(int userid) {
        List<OrderInfo> result = new ArrayList<OrderInfo>();
        result = orderInfoMapper.getUnusedOrder(userid);
        result = getTicketInfo(result);
        return result;
    }

    @Override
    public List<OrderInfo> getHistoryOrder(int userid) {
        List<OrderInfo> result = new ArrayList<OrderInfo>();
        result = orderInfoMapper.getHistoryOrder(userid);
        result = getTicketInfo(result);
        return result;
    }

    @Override
    public String afterPay(OrderInfo orderInfo) {

        //读取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳

        orderInfo.setStatus(2);
        orderInfo.setMark(2);
        orderInfo.setPaydate(date);

        System.out.println("修改订单支付状态" + orderInfo);
        
        int m = 0;
        m = orderInfoMapper.afterPay(orderInfo);

        if (m != 0){
            return "success";
        }else{
            return "error";
        }
    }
}
