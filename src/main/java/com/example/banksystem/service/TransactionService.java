package com.example.banksystem.service;

import com.example.banksystem.entity.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionService {

    void deposit(Long accountId, BigDecimal amount);

    void withdraw(Long accountId, BigDecimal amount);

    void transfer(Long fromAccountId, Long toAccountId, BigDecimal amount);

    List<Transaction> getStatement(Long accountId);
}
