package cn.train.mapper;

import cn.train.enity.TrainInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainInfoMapper {
    List<TrainInfo>getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    TrainInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);

    List<TrainInfo> getTrainByDay(String day);

    int getTrainidByTrainInfo(TrainInfo trainInfo);
}