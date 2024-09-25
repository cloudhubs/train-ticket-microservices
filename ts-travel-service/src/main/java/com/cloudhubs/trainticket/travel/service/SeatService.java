package com.cloudhubs.trainticket.travel.service;

import com.cloudhubs.trainticket.travel.entity.Seat;
import com.cloudhubs.trainticket.travel.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface SeatService {

    Response distributeSeat(Seat seatRequest, HttpHeaders headers);
    Response getLeftTicketOfInterval(Seat seatRequest, HttpHeaders headers);
}
