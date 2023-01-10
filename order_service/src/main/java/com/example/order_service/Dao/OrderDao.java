package com.example.order_service.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order_service.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<Order> {

}
