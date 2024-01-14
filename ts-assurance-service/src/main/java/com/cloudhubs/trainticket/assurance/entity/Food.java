package com.cloudhubs.trainticket.assurance.entity;


import lombok.Data;


import jakarta.persistence.*;
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
