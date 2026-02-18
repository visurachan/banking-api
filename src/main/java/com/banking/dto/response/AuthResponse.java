package com.banking.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response payload containing JWT token and user details")
public class AuthResponse {

    @Schema(
            description = "JWT access token",
            example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    )
    private String token;

    @Schema(
            description = "Token type (always Bearer)",
            example = "Bearer",
            defaultValue = "Bearer"
    )
    private String tokenType = "Bearer";

    @Schema(
            description = "User's email address",
            example = "john.doe@example.com"
    )
    private String email;

    @Schema(
            description = "User's first name",
            example = "John"
    )
    private String firstName;

    @Schema(
            description = "User's last name",
            example = "Doe"
    )
    private String lastName;

    @Schema(
            description = "User's role",
            example = "CUSTOMER",
            allowableValues = {"CUSTOMER", "ADMIN"}
    )
    private String role;
}

