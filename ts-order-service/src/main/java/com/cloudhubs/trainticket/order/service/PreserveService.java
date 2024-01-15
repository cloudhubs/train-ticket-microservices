package com.cloudhubs.trainticket.order.service;

import com.cloudhubs.trainticket.order.common.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.order.common.entity.OrderTicketsInfo;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
