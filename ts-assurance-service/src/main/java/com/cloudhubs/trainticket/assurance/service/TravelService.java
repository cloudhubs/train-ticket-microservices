package com.cloudhubs.trainticket.assurance.service;

import com.cloudhubs.trainticket.assurance.entity.TravelInfo;
import com.cloudhubs.trainticket.assurance.entity.TripAllDetailInfo;
import com.cloudhubs.trainticket.assurance.entity.TripInfo;
import com.cloudhubs.trainticket.assurance.util.Response;
import org.springframework.http.HttpHeaders;

import java.util.ArrayList;

/**
 * @author Chenjie Xu
 * @date 2017/5/9.
 */
public interface TravelService {

    Response create(TravelInfo info, HttpHeaders headers);

    Response retrieve(String tripId, HttpHeaders headers);

    Response update(TravelInfo info, HttpHeaders headers);

    Response delete(String tripId, HttpHeaders headers);

    Response query(TripInfo info, HttpHeaders headers);

    Response queryByBatch(TripInfo info, HttpHeaders headers);

    Response queryInParallel(TripInfo info, HttpHeaders headers);

    Response getTripAllDetailInfo(TripAllDetailInfo gtdi, HttpHeaders headers);

    Response getRouteByTripId(String tripId, HttpHeaders headers);

    Response getTrainTypeByTripId(String tripId, HttpHeaders headers);

    Response queryAll(HttpHeaders headers);

    Response getTripByRoute(ArrayList<String> routeIds, HttpHeaders headers);

    Response adminQueryAll(HttpHeaders headers);
}
