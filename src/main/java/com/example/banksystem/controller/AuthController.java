package com.example.banksystem.controller;

import com.example.banksystem.security.JwtTokenProvider;
import com.example.banksystem.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final ClientService clientService;
    private final JwtTokenProvider tokenProvider;

    public AuthController(ClientService clientService, JwtTokenProvider tokenProvider) {
        this.clientService = clientService;
        this.tokenProvider = tokenProvider;
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestParam String cpf, @RequestParam String password) {
        clientService.authenticate(cpf, password);
        String token = tokenProvider.generateToken(cpf);
        return ResponseEntity.ok(Map.of("token", token));
    }
}
