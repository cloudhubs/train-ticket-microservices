package com.cloudhubs.trainticket.order.service;

import com.cloudhubs.trainticket.order.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.order.entity.OrderTicketsInfo;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
