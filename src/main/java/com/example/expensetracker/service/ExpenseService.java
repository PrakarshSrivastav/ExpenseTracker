package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getExpensesByUsername(String username);
    void addExpense(Expense expense, String username);
    double getTotalExpensesByUsername(String username);
    void deleteExpense(Long expenseId, String username);
}