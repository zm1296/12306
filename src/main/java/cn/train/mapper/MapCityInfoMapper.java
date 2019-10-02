package cn.train.mapper;

import cn.train.enity.CityInfo;
import cn.train.enity.MapCityInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapCityInfoMapper {
    List<MapCityInfo>getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(MapCityInfo record);

    int insertSelective(MapCityInfo record);

    CityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MapCityInfo record);

    int updateByPrimaryKey(MapCityInfo record);

    float getPriceByCityid(MapCityInfo mapCityInfo);
}