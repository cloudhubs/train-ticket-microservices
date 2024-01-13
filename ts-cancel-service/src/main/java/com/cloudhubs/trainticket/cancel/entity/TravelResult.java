package com.cloudhubs.trainticket.cancel.entity;

import lombok.Data;

import java.util.Map;

/**
 * @author fdse
 */
@Data
public class TravelResult {

    private boolean status;

    private double percent;

    private TrainType trainType;

    private Route route;

    private Map<String,String> prices;

    public TravelResult(){
        //Default Constructor
    }

    public boolean isStatus() {
        return status;
    }

}
