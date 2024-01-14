package com.cloudhubs.trainticket.contacts.service;

import com.cloudhubs.trainticket.contacts.entity.Station;
import com.cloudhubs.trainticket.contacts.util.Response;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface StationService {
    //CRUD
    Response create(Station info, HttpHeaders headers);

    boolean exist(String stationName, HttpHeaders headers);

    Response update(Station info, HttpHeaders headers);

    Response delete(String stationsId, HttpHeaders headers);

    Response query(HttpHeaders headers);

    Response queryForId(String stationName, HttpHeaders headers);

    Response queryForIdBatch(List<String> nameList, HttpHeaders headers);

    Response queryById(String stationId, HttpHeaders headers);

    Response queryByIdBatch(List<String> stationIdList, HttpHeaders headers);

}
