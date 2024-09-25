package com.cloudhubs.trainticket.preserve.entity;

import com.cloudhubs.trainticket.preserve.entity.Route;
import com.cloudhubs.trainticket.preserve.entity.TrainType;
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
