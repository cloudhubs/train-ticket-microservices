package com.cloudhubs.trainticket.travel.entity;

import com.cloudhubs.trainticket.travel.entity.Route;
import com.cloudhubs.trainticket.travel.entity.TrainType;
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
