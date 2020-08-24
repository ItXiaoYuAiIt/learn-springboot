package com.itxiaoyuaiit.learnspringboot.controller;

import com.itxiaoyuaiit.learnspringboot.config.LearnConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HelloController
 * @Description 第一个springboot应用测试
 * @Author wuyuqing
 * @Date 2020/8/20 20:17
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello(){
        Map<String, Object> result = new HashMap<>();
        result.put("msg", "Hello springboot");
        return result;
    }

    @Value("${num}")
    private Integer num;

    @Value("${value}")
    private Integer value;

    @GetMapping("value")
    public String getValue(){
        return "num is\t" + num + "\t" + "value is\t" + value;
    }

    @Autowired
    private LearnConfig learnConfig;

    @GetMapping("/config")
    public Map<String, Object> getConfig(){
        Map<String, Object> result = new HashMap<>();
        result.put("msg", learnConfig);
        return result;
    }



}
