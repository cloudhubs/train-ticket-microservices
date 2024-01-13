package com.cloudhubs.trainticket.adminservice.service;

import com.cloudhubs.trainticket.adminservice.entity.Seat;
import com.cloudhubs.trainticket.adminservice.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface SeatService {

    Response distributeSeat(Seat seatRequest, HttpHeaders headers);
    Response getLeftTicketOfInterval(Seat seatRequest, HttpHeaders headers);
}
