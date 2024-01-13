package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.entity.RouteInfoCommon;
import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface AdminRouteService {

    /**
     * get all routes with headers
     *
     * @param headers headers
     * @return Response
     */
    Response getAllRoutes(HttpHeaders headers);

    /**
     * get all routes with headers
     *
     * @param request route information
     * @param headers headers
     * @return Response
     */
    Response createAndModifyRoute(RouteInfoCommon request, HttpHeaders headers);

    /**
     * get all routes with headers
     *
     * @param routeId route id
     * @param headers headers
     * @return Response
     */
    Response deleteRoute(String routeId, HttpHeaders headers);
}
