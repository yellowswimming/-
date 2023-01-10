package com.example.register.controller;

import com.example.register.service.FindService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务发现
 */
@RestController
@RequestMapping("find")
public class FindController {
    @Resource
    private FindService findService;
    @GetMapping("/{serviceName}")
    public String getServiceUrl(@PathVariable("serviceName") String name) {
        //接受请求的服务名，返回服务地址
        return findService.getUrl(name);
    }
}
