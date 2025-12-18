package com.example.banksystem.service.impl;

import com.example.banksystem.dto.AccountDTO;
import com.example.banksystem.entity.Account;
import com.example.banksystem.repository.AccountRepository;
import com.example.banksystem.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDTO openAccount(AccountDTO dto) {
        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setBalance(dto.getBalance());
        account.setType(dto.getType());
        account.setActive(true);

        accountRepository.save(account);

        return dto;
    }

    @Override
    public AccountDTO getBalance(String accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow();

        AccountDTO dto = new AccountDTO();
        dto.setAccountNumber(account.getAccountNumber());
        dto.setBalance(account.getBalance());

        return dto;
    }

    @Override
    public void closeAccount(String accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow();

        account.setActive(false);
        accountRepository.save(account);
    }
}
