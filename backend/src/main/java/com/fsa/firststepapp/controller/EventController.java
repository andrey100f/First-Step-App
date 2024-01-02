package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.request.AddParticipantRequest;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;
import com.fsa.firststepapp.service.event_service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
@RequestMapping("/api/events")
public class EventController {
    private final IEventService eventService;

    @Autowired
    public EventController(IEventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    public List<EventDto> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PatchMapping("/addParticipant")
    public EventDto addParticipantToEvent(@RequestBody AddParticipantToEventRequest addParticipantToEventRequest){
        return eventService.addParticipantToEvent(addParticipantToEventRequest);
    }
}
