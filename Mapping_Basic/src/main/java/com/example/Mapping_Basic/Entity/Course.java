package com.example.Mapping_Basic.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String courseName;
        private String description;

        @OneToMany(mappedBy = "course", cascade=CascadeType.ALL)
        @JsonManagedReference
        private List<Student> students = new ArrayList<>();


    }


