package com.example.user_service.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user_service.Dao.OrderDao;
import com.example.user_service.Dao.UserDao;
import com.example.user_service.pojo.Order;
import com.example.user_service.pojo.User;
import com.example.user_service.pojo.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RestTemplate restTemplate;
    public UserOrder getUserById(int id){

        User user = userDao.selectOne(new QueryWrapper<User>().eq("id", id));
        int good_id=user.getGoodId();
       // Order order = orderDao.selectOne(new QueryWrapper<Order>().eq("id", good_id));
        // 寻找服务网址前缀
        String url="http://localhost:8080/find/order_service";
        String ob = restTemplate.getForObject(url, String.class);
        //拼接商品id
        ob+=("/order/"+id);
        System.out.println(ob);
        Order or = restTemplate.getForObject("http://"+ob, Order.class);
        UserOrder userOrder = new UserOrder();
        if(or!=null){
            userOrder.setId(or.getId());
            userOrder.setGoodName(or.getGoodName());
            userOrder.setPrice(or.getPrice());
        }
        userOrder.setName(user.getName());
        return userOrder;
    }
}
