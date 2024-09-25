package com.cloudhubs.trainticket.station.service;

import com.cloudhubs.trainticket.station.entity.Seat;
import com.cloudhubs.trainticket.station.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface SeatService {

    Response distributeSeat(Seat seatRequest, HttpHeaders headers);
    Response getLeftTicketOfInterval(Seat seatRequest, HttpHeaders headers);
}
