package com.itxiaoyuaiit.learnspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName LearnConfig
 * @Description TODO
 * @Author wuyuqing
 * @Date 2020/8/20 21:24
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "learn")
public class LearnConfig {

    private String subject;

    private String time;

    private String grade;

    public LearnConfig() {
    }

    public LearnConfig(String subject, String time, String grade) {
        this.subject = subject;
        this.time = time;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
