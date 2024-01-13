package com.cloudhubs.trainticket.auth.service;

import com.cloudhubs.trainticket.auth.dto.BasicAuthDto;
import com.cloudhubs.trainticket.auth.util.Response;
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
