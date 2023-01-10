package com.example.subgateway.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.subgateway.Dao.ServiceDao;
import com.example.subgateway.Pojo.Order;
import com.example.subgateway.Pojo.RegisterService;
import com.example.subgateway.Pojo.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AllService {
    @Autowired
    private ServiceDao dao;

    @Autowired
    private RestTemplate restTemplate;
    public String getUrl(String name,int id){
        if("user".equals(name)){
            RegisterService service = dao.selectOne(new QueryWrapper<RegisterService>().eq("name", "user_service"));
            return service.getUrl();
        }
        else if("order".equals(name)){
            RegisterService service = dao.selectOne(new QueryWrapper<RegisterService>().eq("name", "order_service"));
            return service.getUrl();
        }
        return null;
    }

    public UserOrder getUser(String name,int id){

        String url="http://"+this.getUrl(name,id)+"/user/query/"+id;

        return restTemplate.getForObject(url, UserOrder.class);
    }

    public Order getOrder(String name,int id){
        String url="http://"+this.getUrl(name,id)+"/order/"+id;

        return restTemplate.getForObject(url, Order.class);
    }
}
