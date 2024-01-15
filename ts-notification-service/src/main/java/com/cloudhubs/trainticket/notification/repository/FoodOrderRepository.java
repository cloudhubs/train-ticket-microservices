//package com.cloudhubs.trainticket.notification.repository;
//
//import com.cloudhubs.trainticket.notification.entity.FoodOrder;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//
//@Repository
//public interface FoodOrderRepository extends JpaRepository<FoodOrder, String> {
//
//    Optional<FoodOrder> findById(String id);
//
//    FoodOrder findByOrderId(String orderId);
//
//    @Override
//    List<FoodOrder> findAll();
//
//    void deleteById(UUID id);
//
//    void deleteFoodOrderByOrderId(String id);
//
//}
