package com.practice02.learn_jpa_mappings;

import com.practice02.learn_jpa_mappings.Entity.*;
import com.practice02.learn_jpa_mappings.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;

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
		student1.setCourses(new ArrayList<>());

		Student student2=new Student();

		student2.setId(98765L);
		student2.setName("PQR");
		student2.setCourses(new ArrayList<>());

		Course mathematics=new Course();
		mathematics.setId(1001L);
		mathematics.setName("Mathematics");
		mathematics.setStudents(new ArrayList<>());

		Course physics=new Course();
		physics.setId(2002L);
		physics.setName("Physics");
		physics.setStudents(new ArrayList<>());

		Course chemistry=new Course();
		chemistry.setId(2020L);
		chemistry.setName("Chemistry");
		chemistry.setStudents(new ArrayList<>());

		Course bio=new Course();
		bio.setId(999L);
		bio.setName("Biology");
		bio.setStudents(new ArrayList<>());

		courseRepository.save(mathematics);
		courseRepository.save(physics);
		courseRepository.save(chemistry);
		courseRepository.save(bio);

		student1.addCourses(mathematics);
		student1.addCourses(physics);
		student1.addCourses(chemistry);

		student2.addCourses(bio);
		student2.addCourses(physics);
		student2.addCourses(chemistry);

		studentRepository.save(student1);
		studentRepository.save(student2);
	}
}
