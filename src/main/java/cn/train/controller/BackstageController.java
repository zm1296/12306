package cn.train.controller;

import cn.train.enity.*;
import cn.train.service.BackstageService;
import cn.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackstageController {
    @Autowired
    UserService userService;
    @Autowired
    BackstageService backstageService;
//******运行图信息
    //经停信息
    @RequestMapping("backstage/get_mapstopInfo")
    public List<MapStopInfo> get_mapstopInfo(){
        return backstageService.get_mapstopInfo();
    }
    //获取 运行路线信息
    @RequestMapping("backstage/get_maptrain")
    public List<MapTrainInfo> get_maptrain(){
        return backstageService.get_maptrain();
    }
    //加 运行 路线信息
    @RequestMapping("backstage/add_running")
    public boolean add_running(MapTrainInfo mapTrainInfo){
        return backstageService.add_running(mapTrainInfo)?true:false;
    }
    @RequestMapping("/backstage/del_running")
    public boolean del_running(int id){
        return  backstageService.del_running(id);
    }
    //加 城市经停信息
    @RequestMapping("backstage/add_stopcity")
    public boolean add_stopcity(MapStopInfo mapStopInfo){
       return backstageService.add_stopcity(mapStopInfo)?true:false;
    }
//*******用户信息
    @RequestMapping("/backstage/add_UserInfo")
    public int add_UserInfo(UserInfo userInfo) {
        return userService.Userregsiter(userInfo);
    }

    @RequestMapping("/backstage/get_AllUser")
    public List<UserInfo> get_AllUser() {
        return userService.Get_AllUser();
    }

    @RequestMapping("/backstage/del_user")
    public boolean del_user(int id) {
        return backstageService.del_user(id);
    }

    @RequestMapping("/backstage/alter_UserInfo")
    public boolean alter_UserInfo(UserInfo userInfo) {
        return backstageService.alter_UserInfo(userInfo);
    }
    @RequestMapping("/backstage/select_contact")
    public List<ContactInfo> select_contact(int id) {
        return backstageService.Get_AllContact(id);
    }

//*********车次信息管理部分
    //添加一条车次信息
    @RequestMapping("/backstage/add_trainInfo")
    public boolean add_trainInfo(TrainInfo trainInfo){
       return backstageService.add_trainInfo(trainInfo);
    }
    //修改一条车次信息
    @RequestMapping("/backstage/alter_trainInfo")
    public boolean alter_trainInfo(TrainInfo trainInfo){
        return backstageService.alter_train(trainInfo);
    }
    //删除一条 车次 信息
    @RequestMapping("/backstage/del_trainInfo")
    public boolean del_trainInfo(int id){
        backstageService.del_train(id);
        return true;
    }
    //获取所有 车次
    @RequestMapping("/backstage/get_trainInfo")
    public List<TrainInfo> get_trainInfo()
    {
        return backstageService.get_train();
    }

//**********火车信息
    //添加一辆 火车
    @RequestMapping("/backstage/add_trainmodel")
    public boolean add_trainmodel(TrainModel trainModel){
        return backstageService.add_train(trainModel);
    }
    //获取 所有 火车 的信息 id ，name
    @RequestMapping("/backstage/get_trainmodel")
    public List<TrainModel> get_trainmodel(){
        return backstageService.get_trainmodel();
    }
//**********车票信息
    //已售出的
    @RequestMapping("/backstage/get_soldticket")
    public List<SoldTicket>get_soldticket(){
        return backstageService.get_soldticket();
    }
    //未售出的
    @RequestMapping("/backstage/get_pageN_unsold")
    public int get_pageN_unsold(){
        return backstageService.get_page_unsold();
    }
    @RequestMapping("/backstage/get_unsoldticket")
    public List<UnsoldTicket>get_unsoldticket(@RequestParam int pageNumber,@RequestParam int pageSize){
        System.out.println(pageNumber+"  "+pageSize);
        return backstageService.get_unsoldticket(pageNumber,pageSize);
    }
//**********路线图
 @RequestMapping("backstage/get_mapcity")
    public List<MapCityInfo>get_mapcity(){
        return backstageService.get_mapcity();
 }
 @RequestMapping("backstage/del_mapInfo")
    public boolean del_mapInfo(int id ){
      return   backstageService.del_mapInfo(id);
 }
 @RequestMapping("backstage/add_mapcity")
    public  boolean add_mapcity(MapCityInfo mapCityInfo){
        return backstageService.add_mapcity(mapCityInfo);
 }
}

