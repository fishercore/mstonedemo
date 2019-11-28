package com.mstone.springcloud.demo.client.controller;

import com.alibaba.fastjson.JSONObject;
import com.mstone.springcloud.demo.client.api.DemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-26 15:24
 */
@RestController
@Slf4j
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private DemoApi demoApi;

    @RequestMapping("feigntest001")
    public Map feigntest001() {

        long startTime = System.currentTimeMillis();
        Map resultMap = demoApi.test001();

        long endTime = System.currentTimeMillis();

        log.info("startTime: {}, endTime: {}, cost time: {}", startTime, endTime, endTime - startTime);

        return resultMap;
    }

    @RequestMapping("test001")
    public Map test001() {
        Map resultMap = new HashMap();

        Map param = new HashMap();
        ResponseEntity result = restTemplate.exchange("http://client1/test002/", HttpMethod.GET, null, Map.class, param);

        resultMap.put("result", result);

        return resultMap;
    }

    @RequestMapping("test002")
    public Map test002() {
        Map resultMap = new HashMap();

        resultMap.put("name", discoveryClient.getClass().getName());
        discoveryClient.getInstances("client1").forEach(a -> resultMap.put("port", a.getPort()));

        return resultMap;
    }



}