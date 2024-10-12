package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Entity
@Data
public class Users {

    @Id
    private long id;

    private String name;

    private String email;

    @Transient
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "adressline1", column = @Column(name = "house_number")),
            @AttributeOverride(name = "adressline2", column = @Column(name = "street"))
    })
    private Address adress;

    @Enumerated(EnumType.STRING)
    private Status status;
}

enum Status{
    ACTIVE,
    INACTIVE,
    SUSPENDED
}