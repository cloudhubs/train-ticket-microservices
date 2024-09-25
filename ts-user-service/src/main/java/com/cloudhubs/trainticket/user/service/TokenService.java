package com.cloudhubs.trainticket.user.service;

import com.cloudhubs.trainticket.user.dto.BasicAuthDto;
import com.cloudhubs.trainticket.user.util.Response;
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
