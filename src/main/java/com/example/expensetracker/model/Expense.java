package com.example.expensetracker.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private LocalDate date;
    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}