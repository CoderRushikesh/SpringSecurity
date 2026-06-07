package com.security.dto;

import lombok.RequiredArgsConstructor;


public class JwtResponse {
    private String token;
    public JwtResponse(String token) { this.setToken(token); }
    // getter
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}