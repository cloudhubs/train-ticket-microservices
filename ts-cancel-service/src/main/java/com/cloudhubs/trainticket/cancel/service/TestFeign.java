package com.cloudhubs.trainticket.cancel.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ts-food-service")
public interface TestFeign {

    @GetMapping("/ap/v1/test-controller/feign-response")
    ResponseEntity<String> getFoodResponse();

}
