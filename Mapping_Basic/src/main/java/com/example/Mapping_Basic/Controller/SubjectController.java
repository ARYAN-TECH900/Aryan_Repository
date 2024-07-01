package com.example.Mapping_Basic.Controller;

import com.example.Mapping_Basic.DTO.SubjectDTO;
import com.example.Mapping_Basic.Services.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Subjects")
public class SubjectController {

    @Autowired
     private SubjectServices subjectServices;

    @PostMapping
    public SubjectDTO addSubject(SubjectDTO subjectDTO){
        return subjectServices.addSubject(subjectDTO);
    }

    @GetMapping
    public List<SubjectDTO>  getSubject(){
        return subjectServices.getSubject();
    }
}
