package com.itxiaoyuaiit.learnspringboot.controller;

import com.itxiaoyuaiit.learnspringboot.dao.UserDao;
import com.itxiaoyuaiit.learnspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @ClassName RestController
 * @Description Restful Api 测试
 * @Author wuyuqing
 * @Date 2020/8/23 19:42
 * @Version 1.0
 */
@RestController
public class RestFulApiController {

    @Autowired
    private UserDao userDao;

    /**
     * C
     * @return result
     */
    @PostMapping("/user")
    public Map<String, Object> create(@RequestBody User user){
        Map<String, Object> result = new HashMap<>();
        user = userDao.save(user);
        result.put("msg", user);
        return result;
    }

    /**
     * R
     * @return result
     */
    @GetMapping("/user/{id}")
    public Map<String, Object> reader(@PathVariable("id") Integer id){
        User user = userDao.findById(id).get();
        Map<String, Object> result = new HashMap<>();
        result.put("msg", user);
        return result;
    }

    /**
     * U
     * @return result
     */
    @PutMapping("/user")
    public Map<String, Object> update(@RequestBody User user){
        Map<String, Object> result = new HashMap<>();
        user = userDao.save(user);
        result.put("msg", user);
        return result;
    }

    /**
     * D
     * @return result
     */
    @DeleteMapping("/user/{id}")
    public Map<String, Object> detele(@PathVariable("id") Integer id){
        Map<String, Object> result = new HashMap<>();
        userDao.deleteById(id);
        result.put("msg", id);
        return result;
    }

}
