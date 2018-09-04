package cn.melvin.order.service.order;

import cn.melvin.order.domain.order.Order;

public interface OrderService {
    public Order getOrderById(int id);

    public void insertOne(Order order);
}
