package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
     University findUniversityByName(String name);
}
