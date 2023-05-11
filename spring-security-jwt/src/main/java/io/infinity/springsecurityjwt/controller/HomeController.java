package io.infinity.springsecurityjwt.controller;

import io.infinity.springsecurityjwt.dto.AuthRequest;
import io.infinity.springsecurityjwt.dto.AuthResponse;
import io.infinity.springsecurityjwt.service.AuthService;
import io.infinity.springsecurityjwt.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    AuthService authService;

    @GetMapping("/")
    public String index() {
        return ("<h1>Welcome to the JWT Authentication</h1>");
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest request) throws Exception {

        return ResponseEntity.ok(
                new AuthResponse(authService.authenticate(request))
        );
    }

}
