package com.cloudhubs.trainticket.route.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @author fdse
 */
@Data
@Entity
@GenericGenerator(name = "payment-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
public class Payment {
    @Id
    @NotNull
    @Column(length = 36)
    @GeneratedValue(generator = "payment-jpa-uuid")
    private String id;

    @NotNull
    @Valid
    @Column(length = 36)
    private String orderId;

    @NotNull
    @Valid
    @Column(length = 36)
    private String userId;

    @NotNull
    @Valid
    @Column(name = "payment_price")
    private String price;

    public Payment(){
        this.id = UUID.randomUUID().toString();
        this.orderId = "";
        this.userId = "";
        this.price = "";
    }

}
