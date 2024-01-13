package edu.fudanselab.trainticket.orderservice.service;

import edu.fudanselab.trainticket.common.entity.Order;
import edu.fudanselab.trainticket.common.util.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

/**
 * @author fdse
 */
@Service
public interface AdminOrderService {

    /**
     * get all orders
     *
     * @param headers headers
     * @return Response
     */
    Response getAllOrders(HttpHeaders headers);

    /**
     * delete order by order id, train number
     *
     * @param orderId order id
     * @param trainNumber train number
     * @param headers headers
     * @return Response
     */
    Response deleteOrder(  String orderId,String trainNumber, HttpHeaders headers);

    /**
     * update order by order
     *
     * @param request request
     * @param headers headers
     * @return Response
     */
    Response updateOrder(Order request, HttpHeaders headers);

    /**
     * add order by order
     *
     * @param request request
     * @param headers headers
     * @return Response
     */
    Response addOrder(Order request, HttpHeaders headers);
}
