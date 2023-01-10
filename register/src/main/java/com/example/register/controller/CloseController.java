package com.example.register.controller;

import com.example.register.service.CloseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("close")
public class CloseController {
    @Autowired
    private CloseService closeService;
    @GetMapping("/{name}")
    public String close(@PathVariable("name")String serviceName){

        //处理关闭业务
        closeService.close(serviceName);
        return "关闭成功";
    }

}
