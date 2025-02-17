package com.example.expensetracker.dto;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class LoginDTO {

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    public @NotBlank(message = "Username is required") String getUsername() {
        return username;
    }
}