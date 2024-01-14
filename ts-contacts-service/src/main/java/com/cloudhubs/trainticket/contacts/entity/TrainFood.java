package com.cloudhubs.trainticket.contacts.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.cloudhubs.trainticket.contacts.entity.Food;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@GenericGenerator(name = "train-food-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainFood {

    @Id
    @GeneratedValue(generator = "train-food-jpa-uuid")
    @Column(length = 36)
    private String id;

    @NotNull
    @Column(unique = true)
    private String tripId;

    @ElementCollection(targetClass = Food.class)
    @CollectionTable(name = "train_food_list", joinColumns = @JoinColumn(name = "trip_id"))
    private List<Food> foodList;

    public TrainFood(){
        //Default Constructor
        this.tripId = "";
    }

}
