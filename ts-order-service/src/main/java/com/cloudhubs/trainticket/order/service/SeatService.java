package com.cloudhubs.trainticket.order.service;

import com.cloudhubs.trainticket.order.entity.Seat;
import com.cloudhubs.trainticket.order.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface SeatService {

    Response distributeSeat(Seat seatRequest, HttpHeaders headers);
    Response getLeftTicketOfInterval(Seat seatRequest, HttpHeaders headers);
}
