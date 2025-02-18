package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    private final ExpenseService expenseService;

    public HomeController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        String username = userDetails.getUsername();
        System.out.println(username);
        List<Expense> expenses = expenseService.getExpensesByUsername(username);
        double totalExpenses = expenseService.getTotalExpensesByUsername(username);
        model.addAttribute("expenses", expenses);
        model.addAttribute("totalExpenses", totalExpenses);
        return "home";
    }

    @GetMapping("/add-expense")
    public String showAddExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "add-expense";
    }

    @PostMapping("/add-expense")
    public String addExpense(@ModelAttribute("expense") Expense expense, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        expenseService.addExpense(expense, username);
        return "redirect:/home";
    }
    @PostMapping("/delete-expense")
    public String deleteExpense(@RequestParam Long expenseId, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        expenseService.deleteExpense(expenseId, username);
        return "redirect:/home";
    }
}