package com.fsa.firststepapp.service.question_service;

import com.fsa.firststepapp.models.dto.QuestionDto;
import com.fsa.firststepapp.models.request.AddQuestionRequest;

import java.util.List;

public interface IQuestionService {
    List<QuestionDto> getAllQuestions();
    QuestionDto addQuestion(AddQuestionRequest addQuestionRequest);
}