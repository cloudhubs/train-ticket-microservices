package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.entity.TrainType;
import org.springframework.http.HttpHeaders;

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
