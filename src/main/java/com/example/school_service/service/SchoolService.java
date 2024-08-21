package com.example.school_service.service;

import com.example.school_service.model.School;
import com.example.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School addSchool(School school){
        return schoolRepository.save(school);
    }

    public List<School> fetchSchools(){
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(Long id){
        return schoolRepository.findById(id).orElse(null);
    }
}
