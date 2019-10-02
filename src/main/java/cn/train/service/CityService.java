package cn.train.service;

import cn.train.enity.CityInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    List<CityInfo> getAllCity();

    CityInfo getSaleTime(int id);
}
