package com.example.Mapping_Basic.DTO;

import com.example.Mapping_Basic.Entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        String name;

        @ManyToMany(mappedBy = "subjectsDTO")
        private Set<StudentDTO> studentsDTO = new HashSet<>();
    }


