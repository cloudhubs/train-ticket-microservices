package com.cloudhubs.trainticket.orderrelated.repository;

import com.cloudhubs.trainticket.orderrelated.entity.PriceConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author fdse
 */
@Repository
public interface PriceConfigRepository extends JpaRepository<PriceConfig, String> {

    @Override
    Optional<PriceConfig> findById(String id);

    PriceConfig findByRouteIdAndTrainType(String routeId,String trainType);

    @Query(value="SELECT * FROM price_config WHERE route_id IN ?1 AND train_type IN ?2", nativeQuery = true)
    List<PriceConfig> findByRouteIdsAndTrainTypes(List<String> routeIds, List<String> trainTypes);

    @Override
    List<PriceConfig> findAll();

}
