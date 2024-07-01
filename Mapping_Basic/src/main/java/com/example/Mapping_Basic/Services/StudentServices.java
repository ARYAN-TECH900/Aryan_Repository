package com.example.Mapping_Basic.Services;

import com.example.Mapping_Basic.DTO.StudentDTO;
import com.example.Mapping_Basic.Entity.Student;
import com.example.Mapping_Basic.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public StudentDTO addStudent(StudentDTO studentDTO){
       return studentRepository.save(studentDTO);
    }

    public List<StudentDTO> getStudent(){
        return studentRepository.findAll();
    }
}
