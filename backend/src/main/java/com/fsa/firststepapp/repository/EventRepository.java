package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Optional<Event> findByEventId(Long eventId) ;
}
