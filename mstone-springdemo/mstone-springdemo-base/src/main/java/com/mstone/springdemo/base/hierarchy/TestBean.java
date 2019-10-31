package com.mstone.springdemo.base.hierarchy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-31 09:17
 */
@Slf4j
@AllArgsConstructor
public class TestBean {
    private String context;

    public void hello() {
        log.info("hello: {}", context);
    }


}