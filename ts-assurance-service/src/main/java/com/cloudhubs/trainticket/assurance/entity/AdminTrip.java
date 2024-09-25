package com.cloudhubs.trainticket.assurance.entity;

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
