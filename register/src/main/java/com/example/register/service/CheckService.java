package com.example.register.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.register.Dao.CheckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {
    @Autowired
    private CheckDao checkDao;

    public boolean getCheck(String serviceName){
        if(checkDao.selectOne(new QueryWrapper<com.example.register.pojo.Service>().eq("name",serviceName))!=null){
            return true;
        }
        return false;
    }
}
