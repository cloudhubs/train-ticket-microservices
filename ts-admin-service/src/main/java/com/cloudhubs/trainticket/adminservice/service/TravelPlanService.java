package com.cloudhubs.trainticket.adminservice.service;

import com.cloudhubs.trainticket.adminservice.entity.TransferTravelInfo;
import com.cloudhubs.trainticket.adminservice.entity.TripInfo;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.adminservice.util.Response;
import com.cloudhubs.trainticket.adminservice.entity.TransferTravelInfo;

/**
 * @author fdse
 */
public interface TravelPlanService {

    Response getTransferSearch(TransferTravelInfo info, HttpHeaders headers);

    Response getCheapest(TripInfo info, HttpHeaders headers);

    Response getQuickest(TripInfo info, HttpHeaders headers);

    Response getMinStation(TripInfo info, HttpHeaders headers);

}
