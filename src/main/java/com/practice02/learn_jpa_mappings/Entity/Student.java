package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Student {

    @Id
    private Long id;

    private String name;



    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public void addCourses(Course course){
        if (this.courses==null){
            this.courses=new ArrayList<>();
        }

        course.getStudents().add(this);
        this.courses.add(course);
    }
}
