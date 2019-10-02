package cn.train.controller;

import cn.train.enity.CityInfo;
import cn.train.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping("/api/city/getAllcity")
    public List<CityInfo> getAllcity(){
        return cityService.getAllCity();
    }

    @RequestMapping("/api/city/getCityInfo")
    public CityInfo getSaleTime(@RequestBody CityInfo cityInfo){
        return cityService.getSaleTime(cityInfo.getId());
    }

}
