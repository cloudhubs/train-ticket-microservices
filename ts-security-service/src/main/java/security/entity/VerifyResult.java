package edu.fudanselab.trainticket.entity;

import lombok.Data;

/**
 * @author fdse
 */
@Data
public class VerifyResult {

    private boolean status;

    private String message;

    public VerifyResult() {
        //Default Constructor
    }

}
