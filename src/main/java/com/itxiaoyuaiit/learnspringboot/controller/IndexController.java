package com.itxiaoyuaiit.learnspringboot.controller;

import com.itxiaoyuaiit.learnspringboot.config.LearnConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author wuyuqing
 * @Date 2020/8/23 19:36
 * @Version 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private LearnConfig learnConfig;

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("config", learnConfig);
        return "index";
    }

}
