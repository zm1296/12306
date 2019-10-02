package cn.train.mapper;

import cn.train.enity.OrderInfo;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    List<OrderInfo> getAllOrder(Integer userid);

    List<OrderInfo> getUndoneOrder(Integer userid);

    List<OrderInfo> getUnusedOrder(Integer userid);

    List<OrderInfo> getHistoryOrder(Integer userid);

    int getOrderidByOrderInfo(Integer userid);

    int afterPay(OrderInfo orderInfo);
}