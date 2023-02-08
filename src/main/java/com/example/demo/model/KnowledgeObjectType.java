package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class KnowledgeObjectType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idKnowledgeObjectType")
    private int idKnowledgeObjectType;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdKnowledgeObjectType() {
        return idKnowledgeObjectType;
    }

    public void setIdKnowledgeObjectType(int idKnowledgeObjectType) {
        this.idKnowledgeObjectType = idKnowledgeObjectType;
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
        KnowledgeObjectType that = (KnowledgeObjectType) o;
        return idKnowledgeObjectType == that.idKnowledgeObjectType && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKnowledgeObjectType, name);
    }
}
