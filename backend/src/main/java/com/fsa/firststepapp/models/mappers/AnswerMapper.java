package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Answer;
import com.fsa.firststepapp.models.dto.AnswerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnswerMapper {
    public AnswerMapper() {
    }

    public AnswerDto convertModelToDto(Answer answer) {
        AnswerDto answerDto = new AnswerDto();

        answerDto.setAnswerId(answer.getAnswerId());
        answerDto.setAnswerDate(answer.getAnswerDate());
        answerDto.setText(answer.getText());
        answerDto.setUser(answer.getUser().getName());
        answerDto.setQuestion(answer.getQuestion().getQuestionId());

        return answerDto;
    }

    public List<AnswerDto> convertModelListToDtoList(List<Answer> answers) {
        List<AnswerDto> answerDtos = new ArrayList<>();

        for(Answer answer: answers) {
            answerDtos.add(convertModelToDto(answer));
        }

        return answerDtos;
    }
}
