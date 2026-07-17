package io.github.adirajdev.alumni_connect.entity;

import io.github.adirajdev.alumni_connect.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 1000)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 1000)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 1000)
    private String email;

    @Column(name = "age")
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRole role;

    @Column(name = "degree", length = 100)
    private String degree;

    @Column(name = "major", length = 100)
    private String major;

    @Column(name = "passing_year")
    private Integer passingYear;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
