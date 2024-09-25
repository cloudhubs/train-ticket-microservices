package com.cloudhubs.trainticket.cancel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@GenericGenerator(name = "order-alter-info-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
public class OrderAlterInfo {

    @GeneratedValue(generator = "order-alter-info-jpa-uuid")
    @Column(length = 36)
    private String accountId;

    @GeneratedValue(generator = "order-alter-info-jpa-uuid")
    @Column(length = 36)
    private String previousOrderId;

    private String loginToken;

    private Order newOrderInfo;

    public OrderAlterInfo(){
        newOrderInfo = new Order();
    }
}
