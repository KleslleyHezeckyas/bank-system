package com.example.banksystem.report;

import com.example.banksystem.entity.Transaction;

import java.util.List;

public class TransactionReport {

    public static String generate(List<Transaction> transactions) {
        StringBuilder report = new StringBuilder();

        for (Transaction transaction : transactions) {
            report.append(transaction.getType())
                    .append(" - ")
                    .append(transaction.getAmount())
                    .append("\n");
        }

        return report.toString();
    }
}
