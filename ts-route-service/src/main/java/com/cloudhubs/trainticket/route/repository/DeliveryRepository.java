//package com.cloudhubs.trainticket.route.repository;
//
//import com.cloudhubs.trainticket.route.entity.Delivery;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Repository
//public interface DeliveryRepository extends JpaRepository<Delivery, String> {
//
//
//    Optional<Delivery> findById(String id);
//
//    Delivery findByOrderId(UUID orderId);
//
//    @Override
//    List<Delivery> findAll();
//
//    void deleteById(String id);
//
//    void deleteFoodOrderByOrderId(String id);
//
//}
