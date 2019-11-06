package com.mstone.springdemo.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 11:20
 */
@SpringBootApplication

@EnableAspectJAutoProxy(exposeProxy = true)
public class DbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

}