package com.cloudhubs.trainticket.user.entity;

import com.cloudhubs.trainticket.user.util.StringUtils;
import lombok.Data;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author fdse
 */
@Data
public class RebookInfo {

    @Valid
    @NotNull
    private String loginId;

    @Valid
    @NotNull
    private String orderId;

    @Valid
    @NotNull
    private String oldTripId;

    @Valid
    @NotNull
    private String tripId;

    @Valid
    @NotNull
    private int seatType;

    @Valid
    @NotNull
    private String date;

    public RebookInfo(){
        //Default Constructor
        this.loginId = "";
        this.orderId = "";
        this.oldTripId = "";
        this.tripId = "";
        this.seatType = 0;
        this.date = StringUtils.Date2String(new Date());
    }

}
