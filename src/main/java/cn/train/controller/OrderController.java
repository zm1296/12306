package cn.train.controller;

import cn.train.enity.OrderInfo;
import cn.train.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/api/order/getUndoneOrder")
    public List<OrderInfo> getUndoneOrder(@RequestBody OrderInfo orderInfo){
        return orderService.getUndoneOrder(orderInfo.getUserid());
    }

    @RequestMapping("/api/order/getUnusedOrder")
    public List<OrderInfo> getUnusedOrder(@RequestBody OrderInfo orderInfo){
        return orderService.getUnusedOrder(orderInfo.getUserid());
    }

    @RequestMapping("/api/order/getHistoryOrder")
    public List<OrderInfo> getHistoryOrder(@RequestBody OrderInfo orderInfo){
        return orderService.getHistoryOrder(orderInfo.getUserid());
    }

    @RequestMapping("/api/order/getAllOrderByUserid")
    public List<OrderInfo> getAllOrder(@RequestBody OrderInfo orderInfo){
        return orderService.getAllOrderByuserid(orderInfo.getUserid());
    }

    @RequestMapping("/api/order/afterPay")
    public String afterPay(@RequestBody OrderInfo orderInfo){
        return orderService.afterPay(orderInfo);
    }
}
