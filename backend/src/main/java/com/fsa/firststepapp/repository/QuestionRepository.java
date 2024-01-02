package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
     Question findByQuestionId(Long questionId);
}
