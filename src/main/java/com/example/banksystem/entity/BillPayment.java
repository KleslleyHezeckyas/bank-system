package com.example.banksystem.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bill_payments")
public class BillPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billType;

    private BigDecimal amount;

    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Long getId() {
        return id;
    }

    public String getBillType() {
        return billType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
