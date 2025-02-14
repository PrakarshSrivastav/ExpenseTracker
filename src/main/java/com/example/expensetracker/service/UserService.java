package com.example.expensetracker.service;

import com.example.expensetracker.dto.UserRegistrationDTO;
import com.example.expensetracker.model.User;

public interface UserService {
    User registerUser(UserRegistrationDTO registrationDTO);
}