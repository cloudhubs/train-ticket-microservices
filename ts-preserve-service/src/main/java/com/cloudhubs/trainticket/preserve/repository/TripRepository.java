package com.cloudhubs.trainticket.preserve.repository;

import com.cloudhubs.trainticket.preserve.entity.Trip;
import com.cloudhubs.trainticket.preserve.entity.TripId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

/**
 * @author fdse
 */
@Repository
public interface TripRepository extends CrudRepository<Trip, TripId> {

    Trip findByTripId(TripId tripId);

    void deleteByTripId(TripId tripId);

    @Override
    ArrayList<Trip> findAll();

    ArrayList<Trip> findByRouteId(String routeId);
}