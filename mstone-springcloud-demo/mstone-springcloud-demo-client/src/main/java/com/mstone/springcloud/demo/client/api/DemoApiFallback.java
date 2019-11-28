package com.mstone.springcloud.demo.client.api;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-27 19:51
 */
@Component
public class DemoApiFallback implements DemoApi{

    @Override
    public Map test001() {
        Map result = new HashMap();
        result.put("a", "default");
        return result;
    }
}