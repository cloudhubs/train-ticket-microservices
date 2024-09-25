package com.cloudhubs.trainticket.food.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryInfo {
    private String orderId;
    private String deliveryTime;
}
