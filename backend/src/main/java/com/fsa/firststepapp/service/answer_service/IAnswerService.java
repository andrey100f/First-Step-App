package com.fsa.firststepapp.service.answer_service;

import com.fsa.firststepapp.models.dto.AnswerDto;
import com.fsa.firststepapp.models.request.AddAnswerRequest;

import java.util.List;

public interface IAnswerService {
    List<AnswerDto> getAllAnswers();

    AnswerDto addAnswer(AddAnswerRequest answerRequest);
}
