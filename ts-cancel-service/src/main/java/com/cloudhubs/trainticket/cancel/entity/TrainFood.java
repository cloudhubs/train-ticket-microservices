package com.cloudhubs.trainticket.cancel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.cloudhubs.trainticket.cancel.entity.Food;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;

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
