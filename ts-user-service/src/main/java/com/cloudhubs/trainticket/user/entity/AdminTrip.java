package com.cloudhubs.trainticket.user.entity;

import com.cloudhubs.trainticket.user.entity.Route;
import com.cloudhubs.trainticket.user.entity.TrainType;
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
