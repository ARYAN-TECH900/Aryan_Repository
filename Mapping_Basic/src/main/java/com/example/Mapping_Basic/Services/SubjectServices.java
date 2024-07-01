package com.example.Mapping_Basic.Services;

import com.example.Mapping_Basic.DTO.SubjectDTO;
import com.example.Mapping_Basic.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.LineNumberInputStream;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectServices {

    @Autowired
    private SubjectRepository subjectRepository;


    public SubjectDTO addSubject(SubjectDTO subjectDTO){
        return subjectRepository.save(subjectDTO);
    }

    public Optional<SubjectDTO> findById(Long id){
        return subjectRepository.findById(id);
    }

    public List<SubjectDTO> getSubject(){
        return subjectRepository.findAll();
    }
}
