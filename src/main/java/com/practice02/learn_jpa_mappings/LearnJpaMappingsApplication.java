package com.practice02.learn_jpa_mappings;

import com.practice02.learn_jpa_mappings.Entity.*;
import com.practice02.learn_jpa_mappings.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class LearnJpaMappingsApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;


	public static void main(String[] args) {

		SpringApplication.run(LearnJpaMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student();

		student1.setId(12345L);
		student1.setName("ABC");

		Student student2=new Student();

		student2.setId(98765L);
		student2.setName("PQR");

		Course mathematics=new Course();
		mathematics.setId(1001L);
		mathematics.setName("Mathematics");

		Course physics=new Course();
		physics.setId(2002L);
		physics.setName("Physics");

		Course chemistry=new Course();
		chemistry.setId(2020L);
		chemistry.setName("Chemistry");

		Course bio=new Course();
		bio.setId(999L);
		bio.setName("Biology");

		courseRepository.save(mathematics);
		courseRepository.save(physics);
		courseRepository.save(chemistry);
		courseRepository.save(bio);

		student1.setCourses(mathematics);
		student1.setCourses(physics);
		student1.setCourses(chemistry);

		student2.setCourses(bio);
		student2.setCourses(physics);
		student2.setCourses(chemistry);

		studentRepository.save(student1);
		studentRepository.save(student2);
	}
}
