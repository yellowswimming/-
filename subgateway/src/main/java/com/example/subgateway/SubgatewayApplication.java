package com.example.subgateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.example.subgateway.Dao")
@ServletComponentScan(basePackages = "com.example.subgateway.filter")
public class SubgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubgatewayApplication.class, args);
    }

    @Bean
    public RestTemplate getTemplate(){
        return  new RestTemplate();
    }
}
