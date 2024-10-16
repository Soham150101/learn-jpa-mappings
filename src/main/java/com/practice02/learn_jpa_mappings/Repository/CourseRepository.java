package com.practice02.learn_jpa_mappings.Repository;

import com.practice02.learn_jpa_mappings.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
