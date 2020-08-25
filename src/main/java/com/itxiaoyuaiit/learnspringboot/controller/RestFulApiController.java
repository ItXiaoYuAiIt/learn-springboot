package com.itxiaoyuaiit.learnspringboot.controller;

import com.itxiaoyuaiit.learnspringboot.dao.UserDao;
import com.itxiaoyuaiit.learnspringboot.model.Result;
import com.itxiaoyuaiit.learnspringboot.model.User;
import com.itxiaoyuaiit.learnspringboot.service.UserService;
import com.itxiaoyuaiit.learnspringboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @Autowired
    private UserService userService;

    /**
     * C
     * @return result
     */
    @PostMapping("/user")
    public Result<User> create(@RequestBody @Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(100, bindingResult.getFieldError().getDefaultMessage());
        }else {
            user = userDao.save(user);
            return ResultUtil.success(user);

        }
    }

    /**
     * R
     * @return result
     */
    @GetMapping("/user/{id}")
    public Result<User> reader(@PathVariable("id") Integer id){
        Result result = userService.getUser(id);
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
