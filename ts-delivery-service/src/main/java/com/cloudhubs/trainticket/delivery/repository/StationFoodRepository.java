package com.cloudhubs.trainticket.delivery.repository;

import com.cloudhubs.trainticket.delivery.entity.StationFoodStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StationFoodRepository extends JpaRepository<StationFoodStore, String> {

    @Override
    Optional<StationFoodStore> findById(String id);

    List<StationFoodStore> findByStationName(String stationName);
    List<StationFoodStore> findByStationNameIn(List<String> stationNames);


    @Override
    List<StationFoodStore> findAll();

    @Override
    void deleteById(String id);
}
