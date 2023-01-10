package com.example.user_service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user_service.Dao.UserDao;
import com.example.user_service.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        QueryWrapper<User> qw=new QueryWrapper();

        qw.lambda().eq(User::getName,"吕布");
        User user = userDao.selectOne(qw);
        System.out.println(user);
    }

}
