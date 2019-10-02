package cn.train.mapper;

import cn.train.enity.CityInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    CityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);

    List<CityInfo> getAllCity();

    String getNameByCityid(Integer id);
}