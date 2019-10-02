package cn.train.controller;


import cn.train.enity.MapTrainInfo;
import cn.train.enity.Search;
import cn.train.enity.TrainInfo;
import cn.train.enity.UnsoldTicket;
import cn.train.service.TicketService;
import cn.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TrainController {

    @Autowired
    TicketService ticketService;
    @Autowired
    TrainService trainService;

    @RequestMapping("/api/train/single")
    public List<UnsoldTicket> SingleSearch(@RequestBody Search search){
        return ticketService.SingleSearch(search);
    }

    @RequestMapping("/api/train/getAllTrainInfo")
    public List<MapTrainInfo> getAllTrainInfo(){
        return trainService.getAllTrainInfo();
    }

    @RequestMapping("/api/train/generateDateTrain")
    public int generateDateTrain( TrainInfo trainInfo){

        System.out.println("生成车次请求！日期：" + trainInfo.getDay());
        return trainService.generateDateTrain(trainInfo.getDay());
    }
}
