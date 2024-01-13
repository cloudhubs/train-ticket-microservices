package edu.fudanselab.trainticket.orderservice.service;

import edu.fudanselab.trainticket.common.util.Response;
import org.springframework.http.HttpHeaders;
import edu.fudanselab.trainticket.common.entity.OrderTicketsInfo;

/**
 * @author fdse
 */
public interface PreserveService {

    Response preserve(OrderTicketsInfo oti, HttpHeaders headers);
}
