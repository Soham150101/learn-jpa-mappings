package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

//    @Setter(AccessLevel.NONE)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id_from_order")
    private List<Product> products;

    public void addProduct(Product product){
        if (this.products==null){
            this.products=new ArrayList<>();
        }

        this.products.add(product);
    }

}
