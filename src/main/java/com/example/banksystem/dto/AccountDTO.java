package com.example.banksystem.dto;

import com.example.banksystem.entity.AccountType;
import java.math.BigDecimal;

public class AccountDTO {

    private String accountNumber;
    private BigDecimal balance;
    private AccountType type;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
