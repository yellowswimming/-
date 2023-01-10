package com.example.subgateway.controller;

import com.example.subgateway.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理外部访问需求
 */
@RestController
@RequestMapping("/query")
public class request {
    @Autowired
    private AllService service;
    @GetMapping("/{serverName}/{id}")
    public Object getUserOrOrder(@PathVariable("id")int id,@PathVariable("serverName")String name){

        //获取user业务
        if("user".equals(name)){
            return service.getUser(name,id);
        }

        //获取order业务
        if("order".equals(name)){
            return service.getOrder(name,id);
        }
        return null;
    }




}
