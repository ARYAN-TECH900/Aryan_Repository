package com.example.Mapping_Basic.Repository;

import com.example.Mapping_Basic.DTO.StudentDTO;
import com.example.Mapping_Basic.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDTO, Integer> {
}
