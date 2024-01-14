package com.cloudhubs.trainticket.contacts.entity;


import lombok.Data;

// Commented out and replaced
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
