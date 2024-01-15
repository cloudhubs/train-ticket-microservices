package com.cloudhubs.trainticket.preserve.service;

import com.cloudhubs.trainticket.preserve.entity.OrderTicketsInfo;
import com.cloudhubs.trainticket.preserve.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
