package com.cloudhubs.trainticket.assurance.repository;

import com.cloudhubs.trainticket.assurance.entity.Money;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fdse
 */
public interface AddMoneyRepository extends CrudRepository<Money,String> {
}
