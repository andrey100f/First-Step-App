package com.fsa.firststepapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {
    private Long answerId;
    private String text;
    private Date answerDate;
    private String user;
    private Long question;
}
