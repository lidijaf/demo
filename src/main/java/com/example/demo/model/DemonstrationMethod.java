package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class DemonstrationMethod {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddemonstrationmethod")
    private int idDemonstrationMethod;
    @Basic
    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemonstrationMethod that = (DemonstrationMethod) o;
        return idDemonstrationMethod == that.idDemonstrationMethod && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDemonstrationMethod, name);
    }
}
