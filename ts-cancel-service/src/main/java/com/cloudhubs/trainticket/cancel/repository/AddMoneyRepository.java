package com.cloudhubs.trainticket.cancel.repository;

import com.cloudhubs.trainticket.cancel.entity.Money;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fdse
 */
public interface AddMoneyRepository extends CrudRepository<Money,String> {
}
