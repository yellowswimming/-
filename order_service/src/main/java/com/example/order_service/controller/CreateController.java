package com.example.order_service.controller;

import com.example.order_service.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动并注册服务
 */
@RestController
public class CreateController {
    @Autowired
    private CreateService service;

    @RequestMapping("/regis")
    public boolean Register(){

        //注册逻辑
        service.register("order_service","localhost:8081/");
        return true;
    }
}
