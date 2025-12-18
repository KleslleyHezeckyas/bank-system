package com.example.banksystem.service;

import java.math.BigDecimal;

public interface BillPaymentService {

    void payBill(Long accountId, String billType, BigDecimal amount);
}
