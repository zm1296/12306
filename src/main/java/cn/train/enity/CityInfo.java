package cn.train.enity;

public class CityInfo {
    private Integer id;

    private String name;

    private String saletime;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSaletime() {
        return saletime;
    }

    public void setSaletime(String saletime) {
        this.saletime = saletime == null ? null : saletime.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", saletime='" + saletime + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}