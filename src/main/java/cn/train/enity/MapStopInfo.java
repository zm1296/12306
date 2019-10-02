package cn.train.enity;

public class MapStopInfo {
    private Integer id;

    private Integer cityid;
    private CityInfo cityInfo;

    private String arrive;

    private Integer parktime;

    private String lefts;

    private Integer number ;

    private Integer trainid;
    private MapTrainInfo trainInfo;

    private String ticketgate;

    public String getLefts() {
        return lefts;
    }

    public void setLefts(String lefts) {
        this.lefts = lefts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive == null ? null : arrive.trim();
    }

    public Integer getParktime() {
        return parktime;
    }

    public void setParktime(Integer parktime) {
        this.parktime = parktime;
    }


    public void setlefts(String lefts) {
        this.lefts = lefts == null ? null : lefts.trim();
    }

    public Integer getNumber() {
        return number ;
    }

    public void setNumber(Integer number) {
        this.number  = number;
    }

    public Integer getTrainid() {
        return trainid;
    }

    public void setTrainid(Integer trainid) {
        this.trainid = trainid;
    }

    public String getTicketgate() {
        return ticketgate;
    }

    public void setTicketgate(String ticketgate) {
        this.ticketgate = ticketgate == null ? null : ticketgate.trim();
    }
    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public MapTrainInfo getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(MapTrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }
    public CityInfo getCityInfo() {
        return cityInfo;
    }

}