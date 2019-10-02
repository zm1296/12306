package cn.train.service;

import cn.train.enity.OrderInfo;
import cn.train.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<OrderInfo> getAllOrderByuserid(int userid);

    List<OrderInfo> getUndoneOrder(int userid);

    List<OrderInfo> getUnusedOrder(int userid);

    List<OrderInfo> getHistoryOrder(int userid);

    String afterPay(OrderInfo orderInfo);

}
