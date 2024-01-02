package com.fsa.firststepapp.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(req ->
                        req.requestMatchers("/api/auth/**").permitAll().anyRequest().authenticated()
                         /* ASTEA LE VOM ADAUGA CAND AVEM ADMIN PANEL, NU STERGETI CA VA TAI
                        .requestMatchers(POST, "/api/locations/**").hasAuthority(LOCATION_CREATE.name())
                        .requestMatchers(PUT, "/api/locations/**").hasAuthority(LOCATION_UPDATE.name())
                        .requestMatchers(DELETE, "/api/locations/**").hasAuthority(LOCATION_DELETE.name())
                        .requestMatchers(POST, "/api/events/**").hasAuthority(EVENT_CREATE.name())
                        .requestMatchers(PUT, "/api/events/**").hasAuthority(EVENT_UPDATE.name())
                        .requestMatchers(DELETE, "/api/events/**").hasAuthority(EVENT_READ.name())
                        */
                )
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return httpSecurity.build();
    }
}
