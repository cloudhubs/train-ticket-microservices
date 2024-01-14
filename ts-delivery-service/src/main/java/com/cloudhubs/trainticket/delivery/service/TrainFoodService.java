package com.cloudhubs.trainticket.delivery.service;

import com.cloudhubs.trainticket.delivery.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.delivery.entity.TrainFood;

public interface TrainFoodService {
    TrainFood createTrainFood(TrainFood tf, HttpHeaders headers);

    Response listTrainFood(HttpHeaders headers);

    Response listTrainFoodByTripId(String tripId, HttpHeaders headers);
}
