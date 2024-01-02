package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.service.university_service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:8100", allowedHeaders = "*")
@RequestMapping("/api/universities")
public class UniversityController {
    private final IUniversityService universityService;

    @Autowired
    public UniversityController(IUniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping("")
    public List<UniversityDto> getAllUniversities() {
        return universityService.getAllUniversities();
    }
}
