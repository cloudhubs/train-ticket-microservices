package com.cloudhubs.trainticket.order.service;

import com.cloudhubs.trainticket.order.entity.TransferTravelInfo;
import com.cloudhubs.trainticket.order.entity.TripInfo;
import com.cloudhubs.trainticket.order.util.Response;
import org.springframework.http.HttpHeaders;


/**
 * @author fdse
 */

public interface TravelPlanService {

    Response getTransferSearch(TransferTravelInfo info, HttpHeaders headers);

    Response getCheapest(TripInfo info, HttpHeaders headers);

    Response getQuickest(TripInfo info, HttpHeaders headers);

    Response getMinStation(TripInfo info, HttpHeaders headers);

}

