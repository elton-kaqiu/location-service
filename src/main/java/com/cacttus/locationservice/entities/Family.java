package com.cacttus.locationservice.entities;

import com.cacttus.locationservice.infrastrucutures.helpers.HasId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "families")
public class Family implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "family", fetch = FetchType.LAZY)
    private List<FamilyMember> familyMembers;

    private LocalDateTime createdAt;
}
