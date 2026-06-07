package com.security.UserController;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication; // CORRECT IMPORT
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/profile")
    public ResponseEntity<String> profile(Authentication authentication) {
        return ResponseEntity.ok("user, " + authentication.getName() + ", welcome to your profile!");
    }
}