package com.example.order_service.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.order_service.Dao.OrderDao;
import com.example.order_service.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;
    public Order getOrder(int id){

        return orderDao.selectOne(new QueryWrapper<Order>().eq("id", id));
    }
}
