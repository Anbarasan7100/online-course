package com.skillharbour.dto;

import com.skillharbour.enums.UserStatus;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long userId;
    private String authUserId;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String address;
    private UserStatus status;
}
