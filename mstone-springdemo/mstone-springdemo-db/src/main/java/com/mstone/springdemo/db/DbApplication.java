package com.mstone.springdemo.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 11:20
 */
@SpringBootApplication
//@EnableAspectJAutoProxy
//@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class DbApplication {


    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

}