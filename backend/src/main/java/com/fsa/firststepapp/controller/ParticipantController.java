package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.AnswerDto;
import com.fsa.firststepapp.models.dto.ParticipantDto;
import com.fsa.firststepapp.models.request.AddAnswerRequest;
import com.fsa.firststepapp.models.request.AddParticipantRequest;
import com.fsa.firststepapp.service.participant_service.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
@RequestMapping("/api/participants")
public class ParticipantController {
    private final IParticipantService participantService;

    @Autowired
    public ParticipantController(IParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping("")
    public List<ParticipantDto> getAllParticipants() {
        return participantService.getAllParticipants();
    }

    @PostMapping("/addParticipant")
    public ParticipantDto addParticipant(@RequestBody AddParticipantRequest addParticipantRequest){
        return participantService.addParticipant(addParticipantRequest);}
}
