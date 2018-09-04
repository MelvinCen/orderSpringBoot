package cn.melvin.order.dao.order;

import cn.melvin.order.domain.order.Order;
import cn.melvin.order.domain.order.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IOrder {

    public Order queryOneOrder(int id);

    public Order queryOneOrderWithDetail(int id);

    public int insertOneOrder(Order order);

    public OrderItem queryOneOrderDetail(int id);

    public void insertOneOrderDetail(OrderItem orderItem);

    public void insertBatchOrderDetail(List<OrderItem> orderItems);
}
