package cn.train.service;

import cn.train.enity.MapTrainInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainService {
    List<MapTrainInfo> getAllTrainInfo();

    int generateDateTrain(String date);
}
