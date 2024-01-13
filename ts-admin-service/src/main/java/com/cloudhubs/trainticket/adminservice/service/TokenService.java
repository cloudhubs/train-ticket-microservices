package com.cloudhubs.trainticket.adminservice.service;

import com.cloudhubs.trainticket.adminservice.dto.BasicAuthDto;
import com.cloudhubs.trainticket.adminservice.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface TokenService {

    /**
     * get token by dto
     *
     * @param dto dto
     * @param  headers headers
     * @return Response
     */
    Response getToken(BasicAuthDto dto, HttpHeaders headers);


}
