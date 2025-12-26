package com.Rental.rental.Dtos.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponseDto {
    private String message;   // Success message
    private String username;  // Optional: the registered username
}
