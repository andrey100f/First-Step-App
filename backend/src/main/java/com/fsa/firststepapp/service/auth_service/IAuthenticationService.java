package com.fsa.firststepapp.service.auth_service;

import com.fsa.firststepapp.models.request.AuthenticationRequest;
import com.fsa.firststepapp.models.response.AuthenticationResponse;
import com.fsa.firststepapp.models.request.RegisterRequest;
import com.fsa.firststepapp.models.request.UpdateUserRequest;

public interface IAuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
    AuthenticationResponse updateUser(UpdateUserRequest request);
}
