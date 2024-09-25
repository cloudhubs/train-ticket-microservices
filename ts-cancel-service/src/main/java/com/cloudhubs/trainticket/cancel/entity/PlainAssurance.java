package com.cloudhubs.trainticket.cancel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
public class PlainAssurance implements Serializable {

    private String id;

    private String orderId;

    private  int typeIndex;

    private String typeName;

    private double typePrice;

    public PlainAssurance(){
        //Default Constructor
    }

}
