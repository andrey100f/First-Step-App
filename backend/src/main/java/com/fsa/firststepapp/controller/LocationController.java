package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.service.event_service.IEventService;
import com.fsa.firststepapp.service.location_service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
@RequestMapping("/api/locations")
public class LocationController {
    private final ILocationService locationService;

    @Autowired
    public LocationController(ILocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<LocationDto> getAllLocations() {
        return locationService.getAllLocations();
    }
}
