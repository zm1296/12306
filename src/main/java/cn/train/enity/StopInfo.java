package cn.train.enity;

public class StopInfo {
    private Integer id;

    private Integer trainid;
    private MapTrainInfo mapTrainInfo;

    private Integer cityid;

    private CityInfo cityInfo;

    private String arrive;

    private Integer parktime;

    private String lefts;

    private Integer number;

    private String ticketgate;

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public MapTrainInfo getMapTrainInfo() {
        return mapTrainInfo;
    }

    public void setMapTrainInfo(MapTrainInfo mapTrainInfo) {
        this.mapTrainInfo = mapTrainInfo;
    }

    @Override
    public String toString() {
        return "StopInfo{" +
                "id=" + id +
                ", trainid=" + trainid +
                ", cityid=" + cityid +
                ", cityInfo=" + cityInfo +
                ", arrive='" + arrive + '\'' +
                ", parktime=" + parktime +
                ", lefts='" + lefts + '\'' +
                ", number=" + number +
                ", ticketgate='" + ticketgate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainid() {
        return trainid;
    }

    public void setTrainid(Integer trainid) {
        this.trainid = trainid;
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

    public String getlefts() {
        return lefts;
    }

    public void setlefts(String lefts) {
        this.lefts = lefts == null ? null : lefts.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTicketgate() {
        return ticketgate;
    }

    public void setTicketgate(String ticketgate) {
        this.ticketgate = ticketgate == null ? null : ticketgate.trim();
    }
}