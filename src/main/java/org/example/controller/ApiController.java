package org.example.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.dto.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApiController {

    UserDetailsService userDetailsService;

    @GetMapping(path = "/public/api")
    public String publicApi() {
        return "Hello, " + "! You have access to the public API.";
    }


    @GetMapping(path = "/admin/api")
    @RolesAllowed("ADMIN")
    public User adminApi() {
        return new User(userDetailsService.loadUserByUsername("admin").getUsername(),
                userDetailsService.loadUserByUsername("admin").getAuthorities());
    }


    @GetMapping(path = "/support/api")
    @RolesAllowed("SUPPORT")
    public User supportApi() {
        return new User(userDetailsService.loadUserByUsername("support").getUsername(),
                userDetailsService.loadUserByUsername("support").getAuthorities());
    }
}
