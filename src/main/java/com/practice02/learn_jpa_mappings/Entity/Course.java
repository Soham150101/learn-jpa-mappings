package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Course {

    @Id
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public void addStudents(Student student){
        if (this.students==null){
            this.students=new ArrayList<>();
        }

        student.getCourses().add(this);

        this.students.add(student);
    }
}
