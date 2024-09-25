package com.cloudhubs.trainticket.preserve.service;

import com.cloudhubs.trainticket.preserve.entity.TransferTravelInfo;
import com.cloudhubs.trainticket.preserve.entity.TripInfo;
import com.cloudhubs.trainticket.preserve.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.preserve.entity.TransferTravelInfo;

/**
 * @author fdse
 */
public interface TravelPlanService {

    Response getTransferSearch(TransferTravelInfo info, HttpHeaders headers);

    Response getCheapest(TripInfo info, HttpHeaders headers);

    Response getQuickest(TripInfo info, HttpHeaders headers);

    Response getMinStation(TripInfo info, HttpHeaders headers);

}
