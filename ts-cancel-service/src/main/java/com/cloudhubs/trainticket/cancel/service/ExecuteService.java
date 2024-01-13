package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface ExecuteService {

    /**
     * ticket execute by order id
     *
     * @param orderId order id
     * @param headers headers
     * @return Response
     */
    Response ticketExecute(String orderId, HttpHeaders headers);

    /**
     * ticker collect
     *
     * @param orderId order id
     * @param headers headers
     * @return Response
     */
    Response ticketCollect(String orderId, HttpHeaders headers);

}
