package com.cloudhubs.trainticket.security.entity;

import com.cloudhubs.trainticket.security.entity.Route;
import com.cloudhubs.trainticket.security.entity.TrainType;
import lombok.Data;

/**
 * @author fdse
 */
@Data
public class AdminTrip {
    private Trip trip;
    private TrainType trainType;
    private Route route;

    public AdminTrip(){
        //Default Constructor
    }

}
