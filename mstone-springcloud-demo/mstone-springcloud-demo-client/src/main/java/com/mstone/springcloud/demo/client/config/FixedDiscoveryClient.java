package com.mstone.springcloud.demo.client.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-26 19:54
 */
@Configuration
@ConfigurationProperties("waiter")
@Setter
public class FixedDiscoveryClient implements DiscoveryClient {
    public static final String SERVICE_ID = "client1";

    private List<String> services;

    @Override
    public String description() {
        return "DiscoveryClient that uses service.";
    }

    @Override
    public List<ServiceInstance> getInstances(String serviceId) {

        if(!SERVICE_ID.equalsIgnoreCase(serviceId)) {
            return Collections.emptyList();
        }

        return services.stream().map(s -> {
            return new DefaultServiceInstance(s,
                    SERVICE_ID,
                    s.split(":")[0],
                    Integer.parseInt(s.split(":")[1]),
                    false);
        }).collect(Collectors.toList());
    }

    @Override
    public List<String> getServices() {
        return Collections.singletonList(SERVICE_ID);
    }
}