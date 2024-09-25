package com.cloudhubs.trainticket.orderrelated.repository;

import com.cloudhubs.trainticket.orderrelated.entity.Money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fdse
 */

@Repository
public interface AddMoneyRepository extends JpaRepository<Money,String> {
}
