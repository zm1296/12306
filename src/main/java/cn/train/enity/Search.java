package cn.train.enity;

public class Search {

    private int cityid1;

    private int cityid2;

    private String day1;

    private String day2;

    private int trainid;

    @Override
    public String toString() {
        return "Search{" +
                "cityid1=" + cityid1 +
                ", cityid2=" + cityid2 +
                ", day1='" + day1 + '\'' +
                ", day2='" + day2 + '\'' +
                ", trainid=" + trainid +
                '}';
    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public int getCityid1() {
        return cityid1;
    }

    public void setCityid1(int cityid1) {
        this.cityid1 = cityid1;
    }

    public int getCityid2() {
        return cityid2;
    }

    public void setCityid2(int cityid2) {
        this.cityid2 = cityid2;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }
}
