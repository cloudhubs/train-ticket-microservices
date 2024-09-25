package com.cloudhubs.trainticket.delivery.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * @author fdse
 */
@Data
@Entity
@GenericGenerator(name = "inside-payment-money-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@Table(name = "inside_money")
public class InsidePaymentMoney {

    @Valid
    @NotNull
    @Id
    @Column(length = 36)
    @GeneratedValue(generator = "inside-payment-money-jpa-uuid")
    private String id;

    @Valid
    @NotNull
    @Column(length = 36)
    private String userId;

    @Valid
    @NotNull
    private String money; //NOSONAR

    @Valid
    @NotNull
    @Enumerated(EnumType.STRING)
    private MoneyType type;

    public InsidePaymentMoney(){
        this.userId = "";
        this.money = "";

    }

}
