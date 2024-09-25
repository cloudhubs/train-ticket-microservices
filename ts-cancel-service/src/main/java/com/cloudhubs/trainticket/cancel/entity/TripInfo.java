package com.cloudhubs.trainticket.cancel.entity;

import com.cloudhubs.trainticket.cancel.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
public class TripInfo {
    @Valid
    @NotNull
    private String startPlace;

    @Valid
    @NotNull
    private String endPlace;

    @Valid
    @NotNull
    private String departureTime;

    public TripInfo(){
        //Default Constructor
        this.startPlace = "";
        this.endPlace = "";
        this.departureTime = "";
    }

    public String getStartPlace() {
        return StringUtils.String2Lower(this.startPlace);
    }

    public String getEndPlace() {
        return StringUtils.String2Lower(this.endPlace);
    }

//    public Date getDepartureTime(){
//        return StringUtils.String2Date(this.departureTime);
//    }
}
