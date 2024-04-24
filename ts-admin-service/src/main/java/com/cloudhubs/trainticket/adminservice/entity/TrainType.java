package com.cloudhubs.trainticket.adminservice.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;

// Commented out and replaced
import jakarta.persistence.*;

// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;

@Data
@Entity
@GenericGenerator(name = "train-type-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
public class TrainType {
    @Id
    @GeneratedValue(generator = "train-type-jpa-uuid")
    @Column(length = 36)
    private String id;

    @NotNull
    @Column(name="name", unique = true)
    private String name;

    @Valid
    @Column(name = "economy_class")
    private int economyClass;
    @Valid
    @Column(name = "confort_class")
    private int confortClass;
    @Column(name = "average_speed")
    private int averageSpeed;

    public TrainType(){
        //Default Constructor
    }

    public TrainType(String name, int economyClass, int confortClass) {
        this.name = name;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
    }

    public TrainType(String name, int economyClass, int confortClass, int averageSpeed) {
        this.name = name;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
        this.averageSpeed = averageSpeed;
    }

}
