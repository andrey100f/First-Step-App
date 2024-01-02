package com.fsa.firststepapp.service.user_service;

import com.fsa.firststepapp.models.dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> getAllUsers();
}
