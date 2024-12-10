package com.utp.proyectofinal.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Teacher extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specialty;
    private String degree;
    @ManyToMany(mappedBy = "teachers")
    private Set<Course> courses = new HashSet<>();
}
