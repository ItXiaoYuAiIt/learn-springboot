package com.itxiaoyuaiit.learnspringboot.dao;

import com.itxiaoyuaiit.learnspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @InterfaceName UserDao
 * @Description TODO
 * @Author wuyuqing
 * @Date 2020/8/23 23:55
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
