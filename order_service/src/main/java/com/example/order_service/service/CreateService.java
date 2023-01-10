package com.example.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Service
public class CreateService {
    @Autowired
    private RestTemplate restTemplate;

    public void register(String name,String serviceUrl){

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String time=formatter.format(date);
        String url="http://localhost:8080/register/add";
        com.example.order_service.pojo.Service service = new com.example.order_service.pojo.Service();
        service.setName(name);
        service.setTime(time);
        service.setUrl(serviceUrl);
        HttpEntity http=new HttpEntity(service);
        restTemplate.postForObject(url,http,String.class);

    }
}
