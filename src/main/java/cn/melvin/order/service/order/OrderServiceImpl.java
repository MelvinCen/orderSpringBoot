package cn.melvin.order.service.order;

import cn.melvin.order.dao.order.IOrder;
import cn.melvin.order.dao.order.OrderDao;
import cn.melvin.order.domain.order.Order;
import cn.melvin.order.domain.order.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public void insertOne(Order order) {

        orderDao.insertOneOrder(order);
        for (OrderItem orderItem : order.getOrderItems()) {
            orderItem.setOrderId(order.getId());
        }
        orderDao.insertBatchOrderDetail(order.getOrderItems());

    }
}
