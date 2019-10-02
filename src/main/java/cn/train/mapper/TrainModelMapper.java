package cn.train.mapper;

import cn.train.enity.TrainModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainModelMapper {
    List<TrainModel>getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(TrainModel record);

    int insertSelective(TrainModel record);

    TrainModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainModel record);

    int updateByPrimaryKey(TrainModel record);
}