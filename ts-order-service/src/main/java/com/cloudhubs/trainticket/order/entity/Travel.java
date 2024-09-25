package com.cloudhubs.trainticket.order.entity;

import com.cloudhubs.trainticket.order.entity.Trip;
import com.cloudhubs.trainticket.order.util.StringUtils;
import lombok.Data;

import java.util.Date;

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
