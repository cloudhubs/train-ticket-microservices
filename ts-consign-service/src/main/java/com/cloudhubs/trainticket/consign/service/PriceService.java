package com.cloudhubs.trainticket.consign.service;

import com.cloudhubs.trainticket.consign.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.consign.entity.PriceConfig;

import java.util.List;


/**
 * @author fdse
 */
public interface PriceService {

    Response createNewPriceConfig(PriceConfig priceConfig, HttpHeaders headers);

    PriceConfig findById(String id, HttpHeaders headers);

    Response findByRouteIdsAndTrainTypes(List<String> ridsAndTts, HttpHeaders headers);

    Response findByRouteIdAndTrainType(String routeId, String trainType, HttpHeaders headers);

    Response findAllPriceConfig(HttpHeaders headers);

    Response deletePriceConfig(String pcId, HttpHeaders headers);

    Response updatePriceConfig(PriceConfig c, HttpHeaders headers);

}
