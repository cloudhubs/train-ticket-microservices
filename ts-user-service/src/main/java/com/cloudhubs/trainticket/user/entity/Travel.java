package com.cloudhubs.trainticket.user.entity;

import com.cloudhubs.trainticket.user.entity.Trip;
import com.cloudhubs.trainticket.user.util.StringUtils;
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
