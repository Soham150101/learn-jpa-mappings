package com.practice02.learn_jpa_mappings;

import com.practice02.learn_jpa_mappings.Entity.Address;
import com.practice02.learn_jpa_mappings.Entity.Order;
import com.practice02.learn_jpa_mappings.Entity.Product;
import com.practice02.learn_jpa_mappings.Repository.AddressRepository;
import com.practice02.learn_jpa_mappings.Repository.OrderRepository;
import com.practice02.learn_jpa_mappings.Repository.ProductRepository;
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

	@Autowired
	private ProductRepository productRepository;

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

		Product firstProduct=new Product();
		firstProduct.setId(1001L);
		firstProduct.setName("Product 1");
		firstProduct.setDescription("Its good Product 1");
		firstProduct.setPrice(1099.99f);

		Product secondProduct=new Product();
		secondProduct.setId(2001L);
		secondProduct.setName("Product 2");
		secondProduct.setDescription("Its good Product 2");
		secondProduct.setPrice(111.111f);

		order.addProduct(firstProduct);
		order.addProduct(secondProduct);



		Address billingAddress = new Address();
		billingAddress.setAdressline1("hello");
		billingAddress.setAdressline2("world");
		billingAddress.setCity("X");
		billingAddress.setState("Y");
		billingAddress.setCountry("Z");
		billingAddress.setZipcode("12345");

		billingAddress.setOrder(order);

		order.setAddress(billingAddress);

		orderRepository.save(order);

	}
}
