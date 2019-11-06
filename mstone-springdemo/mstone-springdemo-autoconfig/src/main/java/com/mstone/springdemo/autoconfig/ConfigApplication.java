package com.mstone.springdemo.autoconfig;

import com.mstone.springdemo.autoconfig.config.GreetingApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-04 08:32
 */
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
//
//    @Bean
//    public GreetingApplicationRunner greetingApplicationRunner() {
//        return new GreetingApplicationRunner("aa");
//    }

}