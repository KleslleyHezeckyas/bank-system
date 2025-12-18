package com.example.banksystem.controller;

import com.example.banksystem.dto.AccountDTO;
import com.example.banksystem.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDTO> openAccount(@RequestBody AccountDTO dto) {
        return ResponseEntity.ok(accountService.openAccount(dto));
    }

    @GetMapping("/{accountNumber}/balance")
    public ResponseEntity<AccountDTO> getBalance(@PathVariable String accountNumber) {
        return ResponseEntity.ok(accountService.getBalance(accountNumber));
    }

    @PutMapping("/{accountNumber}/close")
    public ResponseEntity<Void> closeAccount(@PathVariable String accountNumber) {
        accountService.closeAccount(accountNumber);
        return ResponseEntity.noContent().build();
    }
}
