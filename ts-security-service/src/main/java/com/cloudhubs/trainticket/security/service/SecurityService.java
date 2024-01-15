package com.cloudhubs.trainticket.security.service;

import com.cloudhubs.trainticket.security.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.security.entity.SecurityConfig;

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
