package com.fsa.firststepapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long eventId;
    private String name;
    private String description;
    private Long participants;
    private Long location;
    private Date eventDate;
}
