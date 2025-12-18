package com.example.banksystem.controller;

import com.example.banksystem.entity.Client;
import com.example.banksystem.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> register(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.register(client));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(
            @PathVariable Long id,
            @RequestBody Client client
    ) {
        return ResponseEntity.ok(clientService.update(id, client));
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Client> findByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(clientService.findByCpf(cpf));
    }
}
