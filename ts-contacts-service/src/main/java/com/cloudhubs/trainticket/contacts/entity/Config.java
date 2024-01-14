package com.cloudhubs.trainticket.contacts.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
// Commented out and replaced
import jakarta.persistence.*;

// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;
// Commented out and replaced
import jakarta.persistence.*;

/**
 * @author fdse
 */
@Data
@Entity
public class Config {
    @Valid
    @Id
    @NotNull
    private String name;

    @Valid
    @NotNull
    private String value;

    @Valid
    private String description;

    public Config() {
        this.name = "";
        this.value = "";
    }

    public Config(String name, String value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

}
