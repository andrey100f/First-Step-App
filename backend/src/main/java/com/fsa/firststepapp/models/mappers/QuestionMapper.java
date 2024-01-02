package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Question;
import com.fsa.firststepapp.models.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionMapper {
    private final AnswerMapper answerMapper;

    @Autowired
    public QuestionMapper(AnswerMapper answerMapper){
        this.answerMapper = answerMapper;
    }

    public QuestionDto convertModelToDto(Question question) {
        QuestionDto questionDto = new QuestionDto();

        questionDto.setQuestionId(question.getQuestionId());
        questionDto.setText(question.getText());
        questionDto.setQuestionDate(question.getQuestionDate());
        questionDto.setCategory(question.getCategory());
        questionDto.setUser(question.getUser().getName());
        questionDto.setAnswers(answerMapper.convertModelListToDtoList(question.getAnswers()));

        return questionDto;
    }

    public List<QuestionDto> convertModelListToDtoList(List<Question> questions) {
        List<QuestionDto> questionDtos = new ArrayList<>();

        for(Question question: questions) {
            questionDtos.add(convertModelToDto(question));
        }

        return questionDtos;
    }
}
