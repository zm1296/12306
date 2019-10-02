package cn.train.enity;

public class MapTrainInfo {
    private Integer id;

    private String number;

    private Integer modelid;

    private TrainModel trainModel;

    private Integer firststation;

    private CityInfo firstcity;

    private CityInfo lastcity;

    private Integer laststation;

    private Integer stopnumber;

    @Override
    public String toString() {
        return "MapTrainInfo{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", modelid=" + modelid +
                ", trainModel=" + trainModel +
                ", firststation=" + firststation +
                ", firstcity=" + firstcity +
                ", lastcity=" + lastcity +
                ", laststation=" + laststation +
                ", stopnumber=" + stopnumber +
                '}';
    }

    public TrainModel getTrainModel() {
        return trainModel;
    }

    public void setTrainModel(TrainModel trainModel) {
        this.trainModel = trainModel;
    }

    public CityInfo getFirstcity() {
        return firstcity;
    }

    public void setFirstcity(CityInfo firstcity) {
        this.firstcity = firstcity;
    }

    public CityInfo getLastcity() {
        return lastcity;
    }

    public void setLastcity(CityInfo lastcity) {
        this.lastcity = lastcity;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}