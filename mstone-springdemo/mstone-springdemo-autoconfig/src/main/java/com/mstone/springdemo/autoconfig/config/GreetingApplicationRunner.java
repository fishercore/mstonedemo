package com.mstone.springdemo.autoconfig.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-04 08:24
 */
@Slf4j
public class GreetingApplicationRunner implements ApplicationRunner {

    private String name;

    public GreetingApplicationRunner() {
        this("greektime");
    }

    public GreetingApplicationRunner(String name) {
        this.name = name;
        log.info("init greeetingapplicationrunner....{}", name);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("hello everyone, we all like spring");
    }
}