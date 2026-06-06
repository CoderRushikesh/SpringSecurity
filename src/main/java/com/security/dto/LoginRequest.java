package com.security.dto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginRequest {
    private String username;
    private String password;
    // getters/setters
}
