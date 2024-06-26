package com.cloudhubs.trainticket.auth.controller;

import com.cloudhubs.trainticket.auth.dto.AuthDto;
import com.cloudhubs.trainticket.auth.service.AuthUserService;
import com.cloudhubs.trainticket.auth.util.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author fdse
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthUserService authUserService;

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    /**
     * only while  user register, this method will be called by ts-user-service
     * to create a default role use
     *
     * @return
     */
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping
    public HttpEntity<Response> createDefaultUser(@RequestBody AuthDto authDto) {
        logger.info("[createDefaultUser][Create default auth user with authDto][AuthDto: {}]", authDto.toString());
        authUserService.createDefaultAuthUser(authDto);
        Response response = new Response(1, "SUCCESS", authDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}

