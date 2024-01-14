package com.cloudhubs.trainticket.user.service;

import edu.fudanselab.trainticket.entity.OrderTicketsInfo;
import edu.fudanselab.trainticket.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}