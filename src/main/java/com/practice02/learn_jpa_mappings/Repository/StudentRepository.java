package com.practice02.learn_jpa_mappings.Repository;

import com.practice02.learn_jpa_mappings.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
