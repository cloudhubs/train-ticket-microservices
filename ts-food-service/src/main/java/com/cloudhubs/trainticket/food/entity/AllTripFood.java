package com.cloudhubs.trainticket.food.entity;

import com.cloudhubs.trainticket.food.entity.Food;
import com.cloudhubs.trainticket.food.entity.StationFoodStore;
import com.cloudhubs.trainticket.food.entity.TrainFood;
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
