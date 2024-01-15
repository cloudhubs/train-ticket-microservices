package com.cloudhubs.trainticket.cancel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@Entity
@GenericGenerator(name = "notify-info-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyInfo {

    public NotifyInfo(){
        //Default Constructor
    }

    @Id
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Column(length = 36)
    private String id;

    private Boolean sendStatus;

    private String email;
    private String orderNumber;
    private String username;
    private String startPlace;
    private String endPlace;
    private String startTime;
    private String date;
    private String seatClass;
    private String seatNumber;
    private String price;

}
