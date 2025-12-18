package com.example.banksystem.repository;

import com.example.banksystem.entity.BillPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillPaymentRepository extends JpaRepository<BillPayment, Long> {
}
