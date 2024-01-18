package com.cloudhubs.trainticket.cancel.controller;

import com.cloudhubs.trainticket.cancel.service.CancelService;
import com.cloudhubs.trainticket.cancel.service.TestFeign;
import com.cloudhubs.trainticket.cancel.service.impl.CancelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test-controller")
public class TestController {

    @Autowired
    CancelServiceImpl cancelServiceImpl;

    @Autowired
    TestFeign testFeign;

    @GetMapping("/send-mail")
    ResponseEntity<?> sendMail(){
        return ResponseEntity.ok().body(cancelServiceImpl.sendEmail(null,null));
    }

    @GetMapping("/test-feign")
    ResponseEntity<?> testFeign(){
        return testFeign.getFoodResponse();
    }
}
