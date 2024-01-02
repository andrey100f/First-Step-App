package com.fsa.firststepapp.service.university_service;

import com.fsa.firststepapp.models.dto.UniversityDto;

import java.util.List;

public interface IUniversityService {
    List<UniversityDto> getAllUniversities();
}
