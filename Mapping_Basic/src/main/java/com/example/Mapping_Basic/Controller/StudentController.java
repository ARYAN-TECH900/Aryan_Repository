package com.example.Mapping_Basic.Controller;

//import com.example.Mapping_Basic.DTO.StudentDTO;
import com.example.Mapping_Basic.DTO.StudentDTO;
import com.example.Mapping_Basic.DTO.SubjectDTO;
import com.example.Mapping_Basic.Entity.Student;
import com.example.Mapping_Basic.Entity.Subject;
import com.example.Mapping_Basic.Repository.SubjectRepository;
import com.example.Mapping_Basic.Services.StudentServices;
import com.example.Mapping_Basic.Services.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @Autowired
    private SubjectServices subjectServices;

    @Autowired
    private SubjectRepository subjectRepository;

//    @PostMapping
//    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
//        Set<SubjectDTO> subjectsDTO = new HashSet<>();
//        for (SubjectDTO subjectDTO : studentDTO.getSubjectsDTO()) {
//            if (subjectDTO.getId() != null) {
//                Optional<SubjectDTO> foundSubject;
//                foundSubject = subjectRepository.findById(subjectDTO.getId());
//                foundSubject.ifPresent(subjectsDTO::add);
//            } else {
//
//                SubjectDTO newSubjectDTO;
//                newSubjectDTO = subjectRepository.save(subjectDTO);
//                newSubjectDTO.add(subjectDTO);
//            }
//        }
//
//        studentDTO.setSubjectsDTO(subjectsDTO);
//
//        return studentServices.addStudent(studentDTO);
//    }
@PostMapping
public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
    Set<SubjectDTO> subjectsDTO = new HashSet<>();
    for (SubjectDTO subjectDTO : studentDTO.getSubjectsDTO()) {
        if (subjectDTO.getId() != null) {
            Optional<SubjectDTO> foundSubjectDTO = subjectRepository.findById(subjectDTO.getId());
            foundSubjectDTO.ifPresent(subjectsDTO::add);
        } else {
            SubjectDTO newSubjectDTO = subjectRepository.save(subjectDTO);
            subjectsDTO.add(newSubjectDTO);
        }
    }
    studentDTO.setSubjectsDTO(subjectsDTO);
    return studentServices.addStudent(studentDTO);
}



    @GetMapping
    public List<StudentDTO> getStudent() {
        return studentServices.getStudent();
    }
}
