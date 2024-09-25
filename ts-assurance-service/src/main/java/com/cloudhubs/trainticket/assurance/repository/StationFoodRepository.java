package com.cloudhubs.trainticket.assurance.repository;

import com.cloudhubs.trainticket.assurance.entity.StationFoodStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StationFoodRepository extends CrudRepository<StationFoodStore, String> {

    @Override
    Optional<StationFoodStore> findById(String id);

    List<StationFoodStore> findByStationName(String stationName);
    List<StationFoodStore> findByStationNameIn(List<String> stationNames);


    @Override
    List<StationFoodStore> findAll();

    @Override
    void deleteById(String id);
}
