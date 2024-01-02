package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Faculty;
import com.fsa.firststepapp.models.dto.FacultyDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FacultyMapper {

    public FacultyMapper() {
    }

    public FacultyDto convertModelToDto(Faculty faculty) {
        FacultyDto facultyDto = new FacultyDto();
        
        facultyDto.setFacultyId(faculty.getFacultyId());
        facultyDto.setName(faculty.getName());

        return facultyDto;
    }

    public List<FacultyDto> convertModelListToDtoList(List<Faculty> faculties) {
        List<FacultyDto> facultyDtos = new ArrayList<>();

        for(Faculty faculty: faculties) {
            facultyDtos.add(convertModelToDto(faculty));
        }

        return facultyDtos;
    }
}
