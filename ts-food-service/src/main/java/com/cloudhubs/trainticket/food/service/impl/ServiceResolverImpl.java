package com.cloudhubs.trainticket.food.service.impl;

import com.cloudhubs.trainticket.food.service.ServiceResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ServiceResolverImpl implements ServiceResolver {

    @Autowired
    Environment environment;

    @Override
    public String getServiceUrl(String serviceName) {
        return "http://localhost:" + environment.getProperty("local.server.port");
    }
}
