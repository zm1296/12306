package cn.train.enity;

public class ContactInfo {
    private Integer id;

    private Integer userid;

    private String name;

    private String idnumber;

    private Integer sex;

    private String phone;

    private String email;

    private Integer traveltype;

    private String discountcard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(Integer traveltype) {
        this.traveltype = traveltype;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard == null ? null : discountcard.trim();
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id=" + id +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", traveltype=" + traveltype +
                ", discountcard='" + discountcard + '\'' +
                '}';
    }
}