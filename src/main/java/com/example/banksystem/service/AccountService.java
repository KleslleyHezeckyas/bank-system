package com.example.banksystem.service;

import com.example.banksystem.dto.AccountDTO;

public interface AccountService {

    AccountDTO openAccount(AccountDTO dto);

    AccountDTO getBalance(String accountNumber);

    void closeAccount(String accountNumber);
}
