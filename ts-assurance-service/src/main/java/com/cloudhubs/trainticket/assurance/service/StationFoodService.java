package com.cloudhubs.trainticket.assurance.service;

import com.cloudhubs.trainticket.assurance.entity.StationFoodStore;
import com.cloudhubs.trainticket.assurance.util.Response;
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
