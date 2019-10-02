package cn.train.enity;

import java.util.List;

public class OrderInfo {
    private Integer id;

    private Integer userid;

    private String createdate;

    private String paydate;

    private Float price;

    private Integer status;

    private Integer mark;

    private List<SoldTicket> tickets;

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", userid=" + userid +
                ", createdate='" + createdate + '\'' +
                ", paydate='" + paydate + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", mark=" + mark +
                ", tickets=" + tickets +
                '}';
    }

    public List<SoldTicket> getTickets() {
        return tickets;
    }

    public void setTickets(List<SoldTicket> tickets) {
        this.tickets = tickets;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}