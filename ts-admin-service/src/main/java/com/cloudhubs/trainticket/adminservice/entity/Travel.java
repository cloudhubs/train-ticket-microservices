package com.cloudhubs.trainticket.adminservice.entity;

import com.cloudhubs.trainticket.adminservice.entity.Trip;
import lombok.Data;

/**
 * @author fdse
 */
@Data
public class Travel {

    private Trip trip;

    private String startPlace;

    private String endPlace;

    private String departureTime;

    public Travel(){
        //Default Constructor
    }
}
