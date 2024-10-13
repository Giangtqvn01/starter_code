package com.example.demo.model;

import com.example.demo.model.persistence.User;
import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private String errorMessage;
    private String message;
    private User user;
}
