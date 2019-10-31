package com.mstone.springdemo.base.hierarchy;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-31 09:21
 */
@Aspect
@Slf4j
public class FooAspect {

    @AfterReturning("bean(testBean*)")
    public void printAfter() {
        log.info("after hello()");
    }

}