package com.example.demo.dto;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class UserDto {
    private Long id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String role;
}
