package com.cloudhubs.trainticket.security.service;

import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.security.entity.TrainType;

import java.util.List;

public interface TrainService {
    //CRUD
    boolean create(TrainType trainType, HttpHeaders headers);

    TrainType retrieve(String id,HttpHeaders headers);

    TrainType retrieveByName(String name,HttpHeaders headers);

    List<TrainType> retrieveByNames(List<String> name,HttpHeaders headers);

    boolean update(TrainType trainType,HttpHeaders headers);

    boolean delete(String id,HttpHeaders headers);

    List<TrainType> query(HttpHeaders headers);
}
