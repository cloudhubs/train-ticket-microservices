package com.cloudhubs.trainticket.delivery.repository;

import com.cloudhubs.trainticket.delivery.entity.InsidePaymentMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author fdse
 */
public interface InsidePaymentAddMoneyRepository extends JpaRepository<InsidePaymentMoney,String> {

    /**
     * find by user id
     *
     * @param userId user id
     * @return List<Money>
     */
    List<InsidePaymentMoney> findByUserId(String userId);

    /**
     * find all
     *
     * @return List<Money>
     */
    @Override
    List<InsidePaymentMoney> findAll();
}
