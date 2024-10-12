package com.practice02.learn_jpa_mappings.Repository;

import com.practice02.learn_jpa_mappings.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
