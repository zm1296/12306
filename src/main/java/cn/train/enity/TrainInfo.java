package cn.train.enity;

import java.util.List;

public class TrainInfo {
    private Integer id;

    private String day;

    private String number;

    private Integer stopnumber;

    private Integer firststation;
    private CityInfo cityInfo1;

    private Integer laststation;
    private CityInfo cityInfo2;

    private Integer status;

    private Integer changetime;

    private Integer modelid;

    private List<StopInfo> stoplist;

    @Override
    public String toString() {
        return "TrainInfo{" +
                "id=" + id +
                ", day='" + day + '\'' +
                ", number='" + number + '\'' +
                ", stopnumber=" + stopnumber +
                ", firststation=" + firststation +
                ", laststation=" + laststation +
                ", status=" + status +
                ", changetime=" + changetime +
                ", modelid=" + modelid +
                ", stoplist=" + stoplist +
                '}';
    }

    public void setStoplist(List<StopInfo> stoplist) {
        this.stoplist = stoplist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getStopnumber() {
        return stopnumber;
    }

    public void setStopnumber(Integer stopnumber) {
        this.stopnumber = stopnumber;
    }

    public Integer getFirststation() {
        return firststation;
    }

    public void setFirststation(Integer firststation) {
        this.firststation = firststation;
    }

    public Integer getLaststation() {
        return laststation;
    }

    public void setLaststation(Integer laststation) {
        this.laststation = laststation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChangetime() {
        return changetime;
    }

    public void setChangetime(Integer changetime) {
        this.changetime = changetime;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public CityInfo getCityInfo1() {
        return cityInfo1;
    }

    public void setCityInfo1(CityInfo cityInfo1) {
        this.cityInfo1 = cityInfo1;
    }

    public CityInfo getCityInfo2() {
        return cityInfo2;
    }

    public void setCityInfo2(CityInfo cityInfo2) {
        this.cityInfo2 = cityInfo2;
    }
}