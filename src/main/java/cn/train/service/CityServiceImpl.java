package cn.train.service;

import cn.train.enity.CityInfo;
import cn.train.mapper.CityInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityInfoMapper cityInfoMapper;

    @Override
    public List<CityInfo> getAllCity() {
        return cityInfoMapper.getAllCity();
    }

    @Override
    public CityInfo getSaleTime(int id) {
        return cityInfoMapper.selectByPrimaryKey(id);
    }
}
