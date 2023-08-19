package com.example.aimind.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "userProfiles")
public class UserProfile {
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    private Long id;

}
