package com.cloudhubs.trainticket.contacts.repository;

import com.cloudhubs.trainticket.contacts.entity.FoodOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, String> {

    Optional<FoodOrder> findById(String id);

    FoodOrder findByOrderId(String orderId);

    @Override
    List<FoodOrder> findAll();

    void deleteById(String id);

    void deleteFoodOrderByOrderId(String id);

}
