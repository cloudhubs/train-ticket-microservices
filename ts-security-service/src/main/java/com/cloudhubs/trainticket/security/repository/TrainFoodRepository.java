package com.cloudhubs.trainticket.security.repository;

import com.cloudhubs.trainticket.security.entity.TrainFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TrainFoodRepository extends JpaRepository<TrainFood, String> {

    Optional<TrainFood> findById(String id);

    @Override
    List<TrainFood> findAll();


    TrainFood findByTripId(String tripId);

    void deleteById(String id);
}
