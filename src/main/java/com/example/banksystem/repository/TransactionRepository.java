package com.example.banksystem.repository;

import com.example.banksystem.entity.Transaction;
import com.example.banksystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccount(Account account);
}
