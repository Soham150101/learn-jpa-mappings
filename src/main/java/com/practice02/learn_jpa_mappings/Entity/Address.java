package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "adds_id")
    private Long addressId;

    private String adressline1;

    private String adressline2;

    private String city;

    private String state;

    private String country;

    private String zipcode;

}


