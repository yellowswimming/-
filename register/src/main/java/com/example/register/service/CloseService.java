package com.example.register.service;

import com.example.register.Dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CloseService {
    @Autowired
    private RegisterDao registerDao;
    public void close(String name){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name",name);
        registerDao.deleteByMap(map);
    }
}
