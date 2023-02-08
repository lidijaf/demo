package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class FarmType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idFarmType")
    private int idFarmType;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdFarmType() {
        return idFarmType;
    }

    public void setIdFarmType(int idFarmType) {
        this.idFarmType = idFarmType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FarmType farmType = (FarmType) o;
        return idFarmType == farmType.idFarmType && Objects.equals(name, farmType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFarmType, name);
    }
}
