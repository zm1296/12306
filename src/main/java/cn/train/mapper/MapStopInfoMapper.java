package cn.train.mapper;

import cn.train.enity.MapStopInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapStopInfoMapper {
    int select_By_Maptrain (int trainid );
    int del_By_Maptrain(int trainid);
    List<MapStopInfo>getAll();
    int insert_H (MapStopInfo mapStopInfo);
    int deleteByPrimaryKey(Integer id);

    int insert(MapStopInfo record);

    int insertSelective(MapStopInfo record);

    MapStopInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MapStopInfo record);

    int updateByPrimaryKey(MapStopInfo record);

    List<MapStopInfo> getMapStopByTrainid(int trainid);
}