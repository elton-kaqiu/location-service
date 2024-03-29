package com.cacttus.locationservice.entities;

import com.cacttus.locationservice.infrastrucutures.helpers.HasId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Family> families;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<FamilyMember> familyMembers;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Location> locations;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
