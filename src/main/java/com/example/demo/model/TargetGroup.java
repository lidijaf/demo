package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class TargetGroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTargetGroup")
    private int idTargetGroup;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdTargetGroup() {
        return idTargetGroup;
    }

    public void setIdTargetGroup(int idTargetGroup) {
        this.idTargetGroup = idTargetGroup;
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
        TargetGroup that = (TargetGroup) o;
        return idTargetGroup == that.idTargetGroup && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTargetGroup, name);
    }
}
