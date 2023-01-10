package com.example.order_service.controller;

import com.example.order_service.pojo.Order;
import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/{id}")
    public Order getOrder(@PathVariable("id")int id){

        return orderService.getOrder(id);
    }
}
