package com.cloudhubs.trainticket.contacts.entity;

import com.cloudhubs.trainticket.contacts.entity.Food;
import com.cloudhubs.trainticket.contacts.entity.StationFoodStore;
import com.cloudhubs.trainticket.contacts.entity.TrainFood;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AllTripFood {

    private List<Food> trainFoodList;

    private Map<String, List<StationFoodStore>>  foodStoreListMap;

    public AllTripFood(){
        //Default Constructor
    }

}
