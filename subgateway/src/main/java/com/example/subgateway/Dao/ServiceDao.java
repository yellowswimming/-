package com.example.subgateway.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.subgateway.Pojo.RegisterService;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceDao extends BaseMapper<RegisterService> {

}
