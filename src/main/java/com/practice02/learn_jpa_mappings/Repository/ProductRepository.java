package com.practice02.learn_jpa_mappings.Repository;

import com.practice02.learn_jpa_mappings.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
