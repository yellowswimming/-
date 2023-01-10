package com.example.register.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.register.Dao.FindDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindService {
    @Autowired
    private FindDao findDao;
    public String getUrl(String ServiceName){
        com.example.register.pojo.Service one = findDao.selectOne(new QueryWrapper<com.example.register.pojo.Service>().eq("name", ServiceName));
        String url = one.getUrl();
        return url;
    }
}
