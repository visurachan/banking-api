package com.banking.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response payload containing user profile information")
public class UserResponse {

    @Schema(
            description = "User's unique identifier",
            example = "1"
    )
    private Long id;

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
            description = "User's phone number",
            example = "07700900123"
    )
    private String phone;

    @Schema(
            description = "User's role",
            example = "CUSTOMER",
            allowableValues = {"CUSTOMER", "ADMIN"}
    )
    private String role;

    @Schema(
            description = "Email verification status",
            example = "false"
    )
    private Boolean isVerified;

    @Schema(
            description = "Account creation timestamp",
            example = "2026-02-17T10:59:41.123456"
    )
    private LocalDateTime createdAt;
}