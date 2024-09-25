package com.cloudhubs.trainticket.rebook.entity;

import com.cloudhubs.trainticket.rebook.entity.Route;
import com.cloudhubs.trainticket.rebook.entity.TrainType;
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
