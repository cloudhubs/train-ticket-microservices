package com.cloudhubs.trainticket.adminservice.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
import java.util.Locale;
import java.util.UUID;

@Data
@Entity
@GenericGenerator(name = "station-jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
public class Station {
    @Id
    @GeneratedValue(generator = "station-jpa-uuid")
    @Column(length = 36)
    private String id;

    @Valid
    @NotNull
    @Column(unique = true)
    private String name;

    private int stayTime;

    public Station(){
        this.name = "";
    }

    public void setName(String name) {
        this.name = name.replace(" ", "").toLowerCase(Locale.ROOT);
    }

    public Station(String name) {
        this.name = name.replace(" ", "").toLowerCase(Locale.ROOT);
    }


    public Station(String name, int stayTime) {
        this.name = name.replace(" ", "").toLowerCase(Locale.ROOT);;
        this.stayTime = stayTime;
    }

}
