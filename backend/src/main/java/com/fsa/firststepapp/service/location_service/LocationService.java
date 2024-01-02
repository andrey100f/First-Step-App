package com.fsa.firststepapp.service.location_service;

import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.LocationMapper;
import com.fsa.firststepapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationService implements ILocationService {
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    @Autowired
    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public List<LocationDto> getAllLocations() {
        List<Location> locations = (List<Location>) locationRepository.findAll();

        if (locations.isEmpty()) {
            throw new EntityNotFoundException("Locations Not Found!!");
        }

        return locationMapper.convertModelListToDtoList(locations);
    }
}
