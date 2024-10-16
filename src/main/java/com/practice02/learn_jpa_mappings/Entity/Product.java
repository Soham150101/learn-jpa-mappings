package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
public class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Float price;

    @ManyToOne
    @JoinColumn(name = "order_id_from_order")
    private Order order;

}
