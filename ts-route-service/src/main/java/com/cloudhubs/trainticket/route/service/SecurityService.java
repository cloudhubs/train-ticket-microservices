package com.cloudhubs.trainticket.route.service;

import com.cloudhubs.trainticket.route.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.route.entity.SecurityConfig;

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
