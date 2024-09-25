package com.cloudhubs.trainticket.food.entity;


import lombok.Data;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Food implements Serializable{

    private String foodName;
    private double price;
    public Food(){
        //Default Constructor
    }

}
