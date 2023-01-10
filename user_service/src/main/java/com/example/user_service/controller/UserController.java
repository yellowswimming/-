package com.example.user_service.controller;

import com.example.user_service.pojo.UserOrder;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查询客户
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/query/{id}")
    public UserOrder getUser(@PathVariable("id") int id){
        //TODO
        //根据id查询客户
        UserOrder userOrder = userService.getUserById(id);
        return userOrder;
    }




}
