package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUser_Username(String username);

    Optional<Expense> findByIdAndUser_Username(Long id, String username);
}