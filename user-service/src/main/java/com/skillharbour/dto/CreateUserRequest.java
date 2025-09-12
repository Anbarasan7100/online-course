package com.skillharbour.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skillharbour.enums.UserStatus;
import lombok.*;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank(message = "Enter your first name")
    private String firstName;

    @NotBlank(message = "Enter your last name")
    private String lastName;

    @NotNull(message = "Enter your date of birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Enter your contact number")
    private String contactNumber;

    @NotBlank(message = "Enter your address")
    private String address;

    private UserStatus status;

}
