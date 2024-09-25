package com.cloudhubs.trainticket.config.repository;

import com.cloudhubs.trainticket.config.entity.Money;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fdse
 */
public interface AddMoneyRepository extends CrudRepository<Money,String> {
}
