package com.cloudhubs.trainticket.food.service;

import com.cloudhubs.trainticket.food.util.Response;
import com.cloudhubs.trainticket.food.entity.DeliveryInfo;
import com.cloudhubs.trainticket.food.entity.FoodDeliveryOrder;
import com.cloudhubs.trainticket.food.entity.SeatInfo;
import com.cloudhubs.trainticket.food.entity.TripOrderInfo;
import org.springframework.http.HttpHeaders;

public interface FoodDeliveryService {

    Response createFoodDeliveryOrder(FoodDeliveryOrder fd, HttpHeaders headers);

    Response deleteFoodDeliveryOrder(String id, HttpHeaders headers);

    Response getFoodDeliveryOrderById(String id, HttpHeaders headers);

    Response getAllFoodDeliveryOrders(HttpHeaders headers);

    Response getFoodDeliveryOrderByStoreId(String storeId, HttpHeaders headers);

    Response updateTripId(TripOrderInfo tripOrderInfo, HttpHeaders headers);

    Response updateSeatNo(SeatInfo seatInfo, HttpHeaders headers);

    Response updateDeliveryTime(DeliveryInfo deliveryInfo, HttpHeaders headers);
}
