package com.cloudhubs.trainticket.orderrelated.repository;

import com.cloudhubs.trainticket.orderrelated.entity.ConsignPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fdse
 */
@Repository
public interface ConsignPriceConfigRepository extends JpaRepository<ConsignPrice, String> {

    /**
     * find by index
     *
     * @param index index
     * @return ConsignPrice
     */
//    @Query("{ 'index': ?0 }")
    ConsignPrice findByIndex(int index);

}
