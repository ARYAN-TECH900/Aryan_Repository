package com.example.Mapping_Basic.DTO;

import com.example.Mapping_Basic.Entity.Student;
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
public class CourseDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String courseName;
        private String description;

        @OneToMany(mappedBy = "courseDTO", cascade=CascadeType.ALL)
        @JsonManagedReference
        private List<StudentDTO> studentsDTO = new ArrayList<>();


    }



