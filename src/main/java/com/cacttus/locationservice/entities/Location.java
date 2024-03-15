package com.cacttus.locationservice.entities;

import com.cacttus.locationservice.infrastrucutures.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "locations")
public class Location implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "family_member_id")
    private FamilyMember familyMember;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private Double latitude;
    private Double longitude;
    private LocalDateTime created_at;

}
