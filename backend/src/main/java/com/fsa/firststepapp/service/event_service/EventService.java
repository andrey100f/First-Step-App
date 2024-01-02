package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.EventMapper;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;
import com.fsa.firststepapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Autowired
    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public List<EventDto> getAllEvents() {
        List<Event> events = (List<Event>) eventRepository.findAll();

        if (events.isEmpty()) {
            throw new EntityNotFoundException("Events not found!");
        }

        return eventMapper.convertModelListToDtoList(events);
    }

    @Override
    public EventDto addParticipantToEvent(AddParticipantToEventRequest addParticipantToEventRequest) {
        Event event = eventRepository.findByEventId(addParticipantToEventRequest.getEventId()).orElseThrow();
        event.setParticipants(addParticipantToEventRequest.getParticipants());
        Event eventUpdated = eventRepository.save(event);
        return eventMapper.convertModelToDto(eventUpdated);
    }

}
