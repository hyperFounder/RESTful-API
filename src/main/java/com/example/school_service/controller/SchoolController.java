package com.example.school_service.controller;

import com.example.school_service.model.School;
import com.example.school_service.service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/school")

public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school) {
        return schoolService.addSchool(school);
    }

    @GetMapping
    public List<School> fetchSchools(){
        return schoolService.fetchSchools();
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable Long id) {
        return schoolService.fetchSchoolById(id);
    }
}
