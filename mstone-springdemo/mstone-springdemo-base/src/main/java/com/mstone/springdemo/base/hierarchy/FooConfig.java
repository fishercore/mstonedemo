package com.mstone.springdemo.base.hierarchy;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-31 09:21
 */
@Configuration
@Slf4j
@EnableAspectJAutoProxy
public class FooConfig {

    @Bean
    public TestBean testBeanx() {
        return new TestBean("foo");
    }

    @Bean
    public TestBean testBeany() {
        return new TestBean("foo");
    }

    @Bean
    public FooAspect fooAspect() {
        return new FooAspect();
    }
    
}