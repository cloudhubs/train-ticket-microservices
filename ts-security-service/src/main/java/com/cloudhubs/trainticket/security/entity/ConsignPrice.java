package com.cloudhubs.trainticket.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@Entity
@GenericGenerator(name = "consign-price-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@Table(name="consign_price")
public class ConsignPrice {
    @Id
    @GeneratedValue(generator = "consign-price-jpa-uuid")
    @Column(length = 36)
    private String id;
    @Column(name = "idx",unique = true)
    private int index;
    @Column(name = "initial_weight")
    private double initialWeight;
    @Column(name = "initial_price")
    private double initialPrice;
    @Column(name = "within_price")
    private double withinPrice;
    @Column(name = "beyond_price")
    private double beyondPrice;

    public ConsignPrice(){
        //Default Constructor
    }

}
