package com.mstone.springcloud.demo.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-26 16:04
 */
@FeignClient(name = "client1", contextId = "client", fallback = DemoApiFallback.class)
public interface DemoApi {

    @RequestMapping(value = "/test001")
    Map test001();
}