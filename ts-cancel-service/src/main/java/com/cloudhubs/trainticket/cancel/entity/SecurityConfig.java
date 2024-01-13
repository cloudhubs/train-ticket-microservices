package com.cloudhubs.trainticket.cancel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author fdse
 */
@Data
@Entity
@GenericGenerator(name = "security-conf-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecurityConfig {

    @Id
    @GeneratedValue(generator = "security-conf-jpa-uuid")
    @Column(length = 36)
    private String id;

    private String name;

    private String value;

    private String description;

    public SecurityConfig() {
        //Default Constructor
    }

}
