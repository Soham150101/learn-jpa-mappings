package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    private String orderTrackingNumber;

    private int totalQuantity;

    private BigDecimal totalPrice;

    private String status;

    @CreationTimestamp
    private Date dateCreated;

    @UpdateTimestamp
    private Date lastUpdated;


    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "address_id_from_oder", referencedColumnName = "adds_id")
//    @JoinColumn
    private Address address;


}
