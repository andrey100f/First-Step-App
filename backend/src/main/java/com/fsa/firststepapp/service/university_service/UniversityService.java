package com.fsa.firststepapp.service.university_service;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.UniversityMapper;
import com.fsa.firststepapp.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversityService implements IUniversityService {
    private final UniversityRepository universityRepository;
    private final UniversityMapper universityMapper;

    @Autowired
    public UniversityService(UniversityRepository universityRepository, UniversityMapper universityMapper) {
        this.universityRepository = universityRepository;
        this.universityMapper = universityMapper;
    }

    @Override
    public List<UniversityDto> getAllUniversities() {
        List<University> universities = (List<University>) universityRepository.findAll();

        if (universities.isEmpty()) {
            throw new EntityNotFoundException("Universities Not Found!!");
        }

        return universityMapper.convertModelListToDtoList(universities);
    }
}
