package com.cloudhubs.trainticket.user.service;

import com.cloudhubs.trainticket.user.entity.OrderTicketsInfo;
import com.cloudhubs.trainticket.user.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
