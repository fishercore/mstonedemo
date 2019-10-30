package com.mstone.springdemo.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 11:20
 */
@SpringBootApplication
@MapperScan
public class DbApplication {


    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

}