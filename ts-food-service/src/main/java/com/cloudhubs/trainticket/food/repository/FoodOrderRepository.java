package com.cloudhubs.trainticket.food.repository;

import com.cloudhubs.trainticket.food.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, String> {

    Optional<FoodOrder> findById(String id);

    FoodOrder findByOrderId(String orderId);

    @Override
    List<FoodOrder> findAll();

    void deleteById(String id);

    void deleteFoodOrderByOrderId(String id);

}
