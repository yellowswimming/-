package com.example.user_service.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.user_service.pojo.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserDao extends BaseMapper<User> {

}
