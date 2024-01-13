package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.entity.Payment;
import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author Chenjie
 * @date 2017/4/3
 */
public interface PaymentService {

    Response pay(Payment info, HttpHeaders headers);

    Response addMoney(Payment info, HttpHeaders headers);

    Response query(HttpHeaders headers);

    void initPayment(Payment payment,HttpHeaders headers);

}
