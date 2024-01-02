package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
