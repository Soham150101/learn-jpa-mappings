package com.practice02.learn_jpa_mappings.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    private Long id;

    private String name;
}
