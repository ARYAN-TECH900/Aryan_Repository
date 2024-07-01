package com.example.Mapping_Basic.Controller;

import com.example.Mapping_Basic.DTO.CourseDTO;
import com.example.Mapping_Basic.DTO.StudentDTO;
import com.example.Mapping_Basic.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Courses")
public class CourseController {

    @Autowired
    private CourseServices courseServices;


    @PostMapping
    public CourseDTO addCourse(@RequestBody CourseDTO courseDTO){
        if (courseDTO.getStudentsDTO() == null) {
            courseDTO.setStudentsDTO(new ArrayList<>());
        }
        for (StudentDTO studentDTO : courseDTO.getStudentsDTO()) {
            studentDTO.setCourseDTO(courseDTO);
        }
        return courseServices.addCourses(courseDTO);
    }

    @GetMapping
    public List<CourseDTO> getCourse(){
        return courseServices.getCourse();
    }
}
