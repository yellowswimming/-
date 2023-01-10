package com.example.order_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.example.order_service.Dao")
public class OrderServiceApplication  {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 启动即注册
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                restTemplate().getForObject("http://localhost:8081/regis", String.class);
                Runtime.getRuntime().addShutdownHook(new Thread() {
                    @Override
                    public void run() {
                        String url = "http://localhost:8080/close/order_service";
                        restTemplate().getForObject(url, String.class);
                    }
                });
            }
        };
    }
}
