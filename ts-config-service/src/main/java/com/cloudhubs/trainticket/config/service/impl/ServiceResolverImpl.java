package com.cloudhubs.trainticket.config.service.impl;

import com.cloudhubs.trainticket.config.service.ServiceResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceResolverImpl implements ServiceResolver {

    @Autowired
    Environment environment;

    @Override
    public String getServiceUrl(String serviceName) {
        Map<String, String> serviceMap = new HashMap<>();

        serviceMap.put("ts-preserve-service", "ts-order-service");
        serviceMap.put("ts-travel-service", "ts-rebook-service");
        serviceMap.put("ts-admin-order-service", "ts-order-service");
        serviceMap.put("ts-auth-service", "ts-auth-service");
        serviceMap.put("ts-order-other-service", "ts-preserve-service");
        serviceMap.put("ts-basic-service", "ts-notification-service");
        serviceMap.put("ts-admin-travel-service", "ts-rebook-service");
        serviceMap.put("ts-food-service", "ts-contacts-service");
        serviceMap.put("ts-train-food-service", "ts-delivery-service");
        serviceMap.put("ts-user-service", "ts-user-service");
        serviceMap.put("ts-admin-route-service", "ts-route-service");
        serviceMap.put("ts-preserve-other-service", "ts-order-service");
        serviceMap.put("ts-route-service", "ts-route-service");
        serviceMap.put("ts-wait-order-service", "ts-rebook-service");
        serviceMap.put("ts-travel-plan-service", "ts-order-service");
        serviceMap.put("ts-seat-service", "ts-travel-service");
        serviceMap.put("ts-config-service", "ts-security-service");
        serviceMap.put("ts-security-service", "ts-config-service");
        serviceMap.put("ts-verification-code-service", "ts-config-service");
        serviceMap.put("ts-admin-user-service", "ts-delivery-service");
        serviceMap.put("ts-contacts-service", "ts-contacts-service");
        serviceMap.put("ts-rebook-service", "ts-rebook-service");
        serviceMap.put("ts-cancel-service", "ts-cancel-service");
        serviceMap.put("ts-notification-service", "ts-notification-service");
        serviceMap.put("ts-consign-price-service", "ts-consign-service");
        serviceMap.put("ts-station-service", "ts-contacts-service");
        serviceMap.put("ts-food-delivery-service", "ts-food-service");
        serviceMap.put("ts-train-service", "ts-assurance-service");
        serviceMap.put("ts-route-plan-service", "ts-rebook-service");
        serviceMap.put("ts-travel2-service", "ts-rebook-service");
        serviceMap.put("ts-assurance-service", "ts-order-related-service");
        serviceMap.put("ts-order-service", "ts-preserve-service");
        serviceMap.put("ts-price-service", "ts-price-service");
        serviceMap.put("ts-admin-basic-info-service", "ts-admin-service");
        serviceMap.put("ts-inside-payment-service", "ts-delivery-service");
        serviceMap.put("ts-station-food-service", "ts-delivery-service");
        serviceMap.put("ts-consign-service", "ts-config-service");
        serviceMap.put("ts-payment-service", "ts-config-service");

        return "http://ts-new-gateway:8888/"+ serviceMap.get(serviceName) /*+ environment.getProperty("local.server.port")*/;
    }
}

