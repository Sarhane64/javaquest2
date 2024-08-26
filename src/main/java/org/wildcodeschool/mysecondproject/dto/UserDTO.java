package org.wildcodeschool.mysecondproject.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    public @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank String email) {
        this.email = email;
    }

    public @NotBlank String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank String password) {
        this.password = password;
    }
}