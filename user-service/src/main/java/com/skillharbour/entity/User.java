package com.skillharbour.entity;

import com.skillharbour.enums.UserStatus;
import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Table(
        name = "users",
        indexes = {@Index(name = "index_users_contact", columnList = "contact_number")}
)
public class User extends BaseEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false,unique = true, length = 100)
    private String authUserId;

    @Column(length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false, unique = true, length = 32)
    private String contactNumber;

    @Column(nullable = false, length = 1000)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

}
