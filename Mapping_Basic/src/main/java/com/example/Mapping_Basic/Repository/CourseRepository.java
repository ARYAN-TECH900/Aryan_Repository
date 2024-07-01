package com.example.Mapping_Basic.Repository;

import com.example.Mapping_Basic.DTO.CourseDTO;
import com.example.Mapping_Basic.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseDTO,Long> {
}
