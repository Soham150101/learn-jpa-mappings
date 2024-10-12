package com.practice02.learn_jpa_mappings.Repository;

import com.practice02.learn_jpa_mappings.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
