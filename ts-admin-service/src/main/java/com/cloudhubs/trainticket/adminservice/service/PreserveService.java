package com.cloudhubs.trainticket.adminservice.service;

import com.cloudhubs.trainticket.adminservice.entity.OrderTicketsInfo;
import com.cloudhubs.trainticket.adminservice.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
