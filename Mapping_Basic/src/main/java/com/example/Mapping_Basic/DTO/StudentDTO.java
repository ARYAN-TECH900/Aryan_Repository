package com.example.Mapping_Basic.DTO;

import com.example.Mapping_Basic.Entity.Address;
import com.example.Mapping_Basic.Entity.Course;
import com.example.Mapping_Basic.Entity.Subject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        int rollNo;
        String name;
        String age;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="Fk_add")
        private AddressDTO addressDTO;

        @ManyToOne
        @JsonBackReference
        @JoinColumn(name="course_id")
        private CourseDTO courseDTO;

        @ManyToMany
        @JoinTable(
                name = "student_subject",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "subject_id")
        )
        private Set<SubjectDTO> subjectsDTO = new HashSet<>();
    }


