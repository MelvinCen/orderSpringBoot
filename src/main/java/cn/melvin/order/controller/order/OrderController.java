package cn.melvin.order.controller.order;

import cn.melvin.order.domain.order.Order;
import cn.melvin.order.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("/getOrderById")
    public Order getOrderById(int id){
        System.out.println("getOrderById被调用!!!");
        return orderService.getOrderById(id);
    }

    @PostMapping("/insertOrder")
    public String insertOne(@RequestBody Order order){
        System.out.println("收到的数据 - " + order);
        orderService.insertOne(order);
        return "success";
    }
}
