package com.example.register.controller;

import com.example.register.pojo.Service;
import com.example.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 服务注册
 */
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    //注册新服务
    @PostMapping  ("/add")
    public String Register(@RequestBody Service service){

        //注册业务逻辑
        System.out.println(service.toString());
        if(registerService.register(service)){
            return "注册成功";
        }
        return "注册失败";
    }

}
