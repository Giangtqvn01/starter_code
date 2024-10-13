package com.example.demo.model.requests;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequest {
    @NotBlank(message = "Username required!")
    private String username;
    @NotBlank(message = "password required!")
    @Size(min = 8, max = 16, message = "password character min {min}, max {max}")
    private String password;
    @NotBlank(message = "confirmPassword required!")
    @Size(min = 8, max = 16, message = "password character min {min}, max {max}")
    private String confirmPassword;

    @AssertTrue(message = "confirmPassword không giống mật khẩu")
    private boolean isConfirmPassword() {
        return password != null && !password.isEmpty()
                && confirmPassword != null && !confirmPassword.isEmpty()
                && password.equals(confirmPassword);
    }
}
