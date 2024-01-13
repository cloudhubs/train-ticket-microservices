package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.cancel.entity.TrainFood;

public interface TrainFoodService {
    TrainFood createTrainFood(TrainFood tf, HttpHeaders headers);

    Response listTrainFood(HttpHeaders headers);

    Response listTrainFoodByTripId(String tripId, HttpHeaders headers);
}
