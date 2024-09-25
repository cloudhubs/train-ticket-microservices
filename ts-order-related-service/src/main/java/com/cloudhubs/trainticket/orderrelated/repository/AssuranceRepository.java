package com.cloudhubs.trainticket.orderrelated.repository;

import com.cloudhubs.trainticket.orderrelated.entity.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

/**
 * @author fdse
 */
@Repository
public interface AssuranceRepository  extends JpaRepository<Assurance, String> {

    /**
     * find by id
     *
     * @param id id
     * @return Assurance
     */
    Optional<Assurance> findById(String id);

    /**
     * find by order id
     *
     * @param orderId order id
     * @return Assurance
     */
    Assurance findByOrderId(String orderId);

    /**
     * delete by id
     *
     * @param id id
     * @return null
     */
    @Transactional
    void deleteById(String id);

    /**
     * remove assurance by order id
     *
     * @param orderId order id
     * @return null
     */
    @Transactional
    void removeAssuranceByOrderId(String orderId);

    /**
     * find all
     *
     * @return ArrayList<Assurance>
     */
    @Override
    ArrayList<Assurance> findAll();
}
