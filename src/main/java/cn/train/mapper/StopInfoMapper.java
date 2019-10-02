package cn.train.mapper;

import cn.train.enity.StopInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StopInfo record);

    int insertSelective(StopInfo record);

    StopInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StopInfo record);

    int updateByPrimaryKey(StopInfo record);

    List<StopInfo> getStopByTrainid(Integer trainid);

    int selectMaxidByTrainid(int trainid);

    int selectMinidByTrainid(int trainid);
}