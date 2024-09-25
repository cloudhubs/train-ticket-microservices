package com.cloudhubs.trainticket.food.service;

import com.cloudhubs.trainticket.food.util.Response;
import com.cloudhubs.trainticket.food.entity.FoodOrder;
import org.springframework.http.HttpHeaders;

import java.util.List;


public interface FoodService {

    Response createFoodOrder(FoodOrder afoi, HttpHeaders headers);

    Response createFoodOrdersInBatch(List<FoodOrder> orders, HttpHeaders headers);
    
    Response deleteFoodOrder(String orderId, HttpHeaders headers);

    Response findByOrderId(String orderId, HttpHeaders headers);

    Response updateFoodOrder(FoodOrder updateFoodOrder, HttpHeaders headers);

    Response findAllFoodOrder(HttpHeaders headers);

    Response getAllFood(String date, String startStation, String endStation, String tripId, HttpHeaders headers);

}
