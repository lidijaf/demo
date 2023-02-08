package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ParticipantSelectionCriteria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idParticipantSelectionCriteria")
    private int idParticipantSelectionCriteria;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdParticipantSelectionCriteria() {
        return idParticipantSelectionCriteria;
    }

    public void setIdParticipantSelectionCriteria(int idParticipantSelectionCriteria) {
        this.idParticipantSelectionCriteria = idParticipantSelectionCriteria;
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
        ParticipantSelectionCriteria that = (ParticipantSelectionCriteria) o;
        return idParticipantSelectionCriteria == that.idParticipantSelectionCriteria && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParticipantSelectionCriteria, name);
    }
}
