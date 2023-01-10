package com.example.register.controller;

import com.example.register.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 心跳检测
 */
@RestController
@RequestMapping("check")
public class CheckController {
    @Autowired
    private CheckService checkService;
    //根据数据库保留的服务，定时向其发送请求，若存活，则返回消息
    @GetMapping("/request/{servername}")
    public boolean feedback(@PathVariable("servername")String name){
        //检测心跳
        if("user".equals(name)){
            name="user_service";
        }
        else if("order".equals(name)){
            name="order_service";
        }
        return checkService.getCheck(name);
    }
}
