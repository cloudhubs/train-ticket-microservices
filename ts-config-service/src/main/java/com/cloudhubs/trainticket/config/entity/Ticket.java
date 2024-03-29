package com.cloudhubs.trainticket.config.entity;

import lombok.Data;

/**
 * @author fdse
 */
@Data
public class Ticket {

    private int seatNo;

    private String startStation;

    private String destStation;

    public Ticket(){
        //Default Constructor
    }

    public Ticket(int seatNo, String startStation, String destStation) {
        this.seatNo = seatNo;
        this.startStation = startStation;
        this.destStation = destStation;
    }
}
