package com.example.user_service.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.user_service.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<Order> {
}
