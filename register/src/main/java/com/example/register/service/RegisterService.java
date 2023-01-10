package com.example.register.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.register.Dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegisterService {
    @Autowired
    private  RegisterDao registerDao;

    public boolean register(com.example.register.pojo.Service service) {
        int cnt=0;
        if(registerDao.selectCount(null)!=0){
            QueryWrapper<com.example.register.pojo.Service> queryWrapper=new QueryWrapper();
            queryWrapper.select("max(id) as maxId");
            List<Map<String, Object>> maps = registerDao.selectMaps(queryWrapper);
            cnt =(int) maps.get(0).get("maxId");
        }
        else{
            cnt=0;
        }



        service.setId(cnt + 1);
        int insert = registerDao.insert(service);
        if (insert <= 0) return false;

        return true;
    }
}
