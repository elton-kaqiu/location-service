package com.cacttus.locationservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;
    private String address;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
