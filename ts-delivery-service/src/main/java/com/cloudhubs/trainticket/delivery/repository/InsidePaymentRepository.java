package com.cloudhubs.trainticket.delivery.repository;

import com.cloudhubs.trainticket.delivery.entity.InsidePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author fdse
 */
public interface InsidePaymentRepository extends JpaRepository<InsidePayment,String> {

    /**
     * find by id
     *
     * @param id id
     * @return Payment
     */
    Optional<InsidePayment> findById(String id);

    /**
     * find by order id
     *
     * @param orderId order id
     * @return List<Payment>
     */
    List<InsidePayment> findByOrderId(String orderId);

    /**
     * find all
     *
     * @return List<Payment>
     */
    @Override
    List<InsidePayment> findAll();

    /**
     * find by user id
     *
     * @param userId user id
     * @return List<Payment>
     */
    List<InsidePayment> findByUserId(String userId);
}
