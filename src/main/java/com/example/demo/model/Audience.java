package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class Audience {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idaudience")
    private int idAudience;
    @Basic
    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience audience = (Audience) o;
        return idAudience == audience.idAudience && Objects.equals(name, audience.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAudience, name);
    }
}
