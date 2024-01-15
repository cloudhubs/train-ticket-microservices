package com.cloudhubs.trainticket.rebook.service;

import com.cloudhubs.trainticket.rebook.entity.TripInfo;
import com.cloudhubs.trainticket.rebook.util.Response;
import org.springframework.http.HttpHeaders;

import java.util.ArrayList;

/**
 * @author  Chenjie Xu
 * @date  2017/6/7.
 */
public interface TravelService2 {
    Response create(com.cloudhubs.trainticket.rebook.entity.TravelInfo info, HttpHeaders headers);

    Response retrieve(String tripId, HttpHeaders headers);

    Response update(com.cloudhubs.trainticket.rebook.entity.TravelInfo info, HttpHeaders headers);

    Response delete(String tripId, HttpHeaders headers);

    Response query(TripInfo info, HttpHeaders headers);

    Response queryByBatch(TripInfo info, HttpHeaders headers);

    Response getTripAllDetailInfo(com.cloudhubs.trainticket.rebook.entity.TripAllDetailInfo gtdi, HttpHeaders headers);

    Response getRouteByTripId(String tripId, HttpHeaders headers);

    Response getTrainTypeByTripId(String tripId, HttpHeaders headers);

    Response queryAll(HttpHeaders headers);

    Response getTripByRoute(ArrayList<String> routeIds, HttpHeaders headers);

    Response adminQueryAll(HttpHeaders headers);
}
