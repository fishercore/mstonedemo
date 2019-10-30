package com.mstone.springdemo.db.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 11:28
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/test")
    public String test() {

        List resultList = jdbcTemplate.queryForList("select * from account");

        return resultList.toString();
    }

    @Data
    public class Account {
        private String id;
        private String name;
        private String balance;
    }

}