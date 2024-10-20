package com.ms.user.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="TB_USERS")
@Getter
@Setter
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @NotBlank
    private String name;
    @NotBlank
    private String email;

}
