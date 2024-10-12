package com.practice02.learn_jpa_mappings;

import com.practice02.learn_jpa_mappings.Entity.Address;
import com.practice02.learn_jpa_mappings.Entity.Order;
import com.practice02.learn_jpa_mappings.Repository.AddressRepository;
import com.practice02.learn_jpa_mappings.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class LearnJpaMappingsApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {

		SpringApplication.run(LearnJpaMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order();

		order.setOrderTrackingNumber("1000");
		order.setStatus("COMPLETED");
		order.setTotalPrice(new BigDecimal(2000));
		order.setTotalQuantity(5);

		Address billingAddress = new Address();
		billingAddress.setAdressline1("hello");
		billingAddress.setAdressline2("world");
		billingAddress.setCity("X");
		billingAddress.setState("Y");
		billingAddress.setCountry("Z");
		billingAddress.setZipcode("12345");


		orderRepository.save(order);

	}
}
