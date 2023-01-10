package com.example.register.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.register.pojo.Service;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FindDao extends BaseMapper<Service> {
}
