package com.cloudhubs.trainticket.orderrelated.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
public class OrderSecurity {

    private int orderNumInLastOneHour;

    private int orderNumOfValidOrder;

    public OrderSecurity() {
        //Default Constructor
    }

}
