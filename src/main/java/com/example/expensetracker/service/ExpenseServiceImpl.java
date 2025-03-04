package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.model.User;
import com.example.expensetracker.repository.ExpenseRepository;
import com.example.expensetracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final UserRepository userRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository, UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Expense> getExpensesByUsername(String username) {
        return expenseRepository.findByUser_Username(username);
    }

    @Override
    public void addExpense(Expense expense, String username) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        expense.setUser(user);
        expenseRepository.save(expense);
    }

    @Override
    public double getTotalExpensesByUsername(String username) {
        List<Expense> expenses=expenseRepository.findByUser_Username(username);
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }


    @Override
    public void deleteExpense(Long expenseId, String username) {
        Expense expense = (Expense) expenseRepository.findByIdAndUser_Username(expenseId, username)
                .orElseThrow(() -> new RuntimeException("Expense not found or you do not have permission to delete it"));
        expenseRepository.delete(expense);
    }
}