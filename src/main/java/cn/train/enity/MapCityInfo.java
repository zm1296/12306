package cn.train.enity;

public class MapCityInfo {
    private Integer id;

    private Integer cityid1;
    private CityInfo cityInfo1;

    private Integer cityid2;
    private CityInfo cityInfo2;

    private Integer distance;

    private Float price;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid1() {
        return cityid1;
    }

    public void setCityid1(Integer cityid1) {
        this.cityid1 = cityid1;
    }

    public Integer getCityid2() {
        return cityid2;
    }

    public void setCityid2(Integer cityid2) {
        this.cityid2 = cityid2;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}