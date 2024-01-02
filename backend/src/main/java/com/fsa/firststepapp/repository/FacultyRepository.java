package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Faculty;
import org.springframework.data.repository.CrudRepository;

public interface FacultyRepository extends CrudRepository<Faculty, Long> {
    Faculty findFacultyByName(String name);
}
