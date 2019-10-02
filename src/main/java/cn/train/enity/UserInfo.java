package cn.train.enity;

public class UserInfo {
    private Integer id;

    private String username;

    private String name;

    private String password;

    private String idnumber;

    private String email;

    private String phone;

    private Integer traveltype;

    private Integer sex;

    private String discountnumber;

    private Integer status;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", traveltype=" + traveltype +
                ", sex=" + sex +
                ", discountnumber='" + discountnumber + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(Integer traveltype) {
        this.traveltype = traveltype;
    }

    public String getDiscountnumber() {
        return discountnumber;
    }

    public void setDiscountnumber(String discountnumber) {
        this.discountnumber = discountnumber == null ? null : discountnumber.trim();
    }
}