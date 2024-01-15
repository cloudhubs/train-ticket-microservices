package com.cloudhubs.trainticket.order.service;

import com.cloudhubs.trainticket.order.entity.OrderTicketsInfo;
import com.cloudhubs.trainticket.order.util.Response;
import org.springframework.http.HttpHeaders;


/**
 * @author fdse
 */
public interface PreserveOtherService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
