package com.mstone.springcloud.demo.client.config;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-27 09:39
 */
public class FixedServerList implements ServerList<Server> {

    @Autowired
    private FixedDiscoveryClient client;

    @Override
    public List<Server> getInitialListOfServers() {


        return getServers();
    }

    @Override
    public List<Server> getUpdatedListOfServers() {
        return getServers();
    }


    private List<Server> getServers() {
        return client.getInstances(FixedDiscoveryClient.SERVICE_ID)
                .stream().map(i -> new Server(i.getHost(), i.getPort()))
                .collect(Collectors.toList());
    }
}