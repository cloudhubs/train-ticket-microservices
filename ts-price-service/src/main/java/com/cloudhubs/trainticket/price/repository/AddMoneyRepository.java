package com.cloudhubs.trainticket.price.repository;

import com.cloudhubs.trainticket.price.entity.Money;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fdse
 */
public interface AddMoneyRepository extends CrudRepository<Money,String> {
}
