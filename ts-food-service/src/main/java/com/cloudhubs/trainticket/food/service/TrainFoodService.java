package com.cloudhubs.trainticket.food.service;

import com.cloudhubs.trainticket.food.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.food.entity.TrainFood;

public interface TrainFoodService {
    TrainFood createTrainFood(TrainFood tf, HttpHeaders headers);

    Response listTrainFood(HttpHeaders headers);

    Response listTrainFoodByTripId(String tripId, HttpHeaders headers);
}
