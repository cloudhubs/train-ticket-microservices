package com.cloudhubs.trainticket.consign.repository;

import com.cloudhubs.trainticket.consign.entity.ConsignPrice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fdse
 */
@Repository
public interface ConsignPriceConfigRepository extends CrudRepository<ConsignPrice, String> {

    /**
     * find by index
     *
     * @param index index
     * @return ConsignPrice
     */
//    @Query("{ 'index': ?0 }")
    ConsignPrice findByIndex(int index);

}
