package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.util.Response;
import com.cloudhubs.trainticket.cancel.entity.StationFoodStore;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface StationFoodService {

    // create data
    Response createFoodStore(StationFoodStore fs, HttpHeaders headers);

//    TrainFood createTrainFood(TrainFood tf, HttpHeaders headers);

    // query all food
    Response listFoodStores(HttpHeaders headers);

//    Response listTrainFood(HttpHeaders headers);

    // query according id
    Response listFoodStoresByStationName(String stationName, HttpHeaders headers);

//    Response listTrainFoodByTripId(String tripId, HttpHeaders headers);

    Response getStaionFoodStoreById(String id);

    Response getFoodStoresByStationNames(List<String> stationNames);

}
