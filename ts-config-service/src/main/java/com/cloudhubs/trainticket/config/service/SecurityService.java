package com.cloudhubs.trainticket.config.service;

import com.cloudhubs.trainticket.config.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.config.entity.SecurityConfig;

/**
 * @author fdse
 */
public interface SecurityService {

    Response findAllSecurityConfig(HttpHeaders headers);

    Response addNewSecurityConfig(SecurityConfig info, HttpHeaders headers);

    Response modifySecurityConfig(SecurityConfig info, HttpHeaders headers);

    Response deleteSecurityConfig(String id, HttpHeaders headers);

    Response check(String accountId, HttpHeaders headers);

}
