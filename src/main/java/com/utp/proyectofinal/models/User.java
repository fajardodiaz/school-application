package com.utp.proyectofinal.models;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@MappedSuperclass
@Getter @Setter @ToString
public class User {
    @Column(updatable = false)
    private LocalDate createdAt;

    private String firstName;
    private String lastName;
    private String email;
}
