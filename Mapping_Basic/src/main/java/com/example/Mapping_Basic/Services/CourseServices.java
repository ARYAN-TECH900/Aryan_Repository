package com.example.Mapping_Basic.Services;

import com.example.Mapping_Basic.DTO.CourseDTO;
import com.example.Mapping_Basic.Entity.Course;
import com.example.Mapping_Basic.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CourseServices {

    @Autowired
     private CourseRepository courseRepository;

     public CourseDTO addCourses(CourseDTO courseDTO){
         return courseRepository.save(courseDTO);
     }

     public List<CourseDTO> getCourse(){
         return courseRepository.findAll();
     }
}
