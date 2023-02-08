package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Tag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTag")
    private int idTag;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
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
        Tag tag = (Tag) o;
        return idTag == tag.idTag && Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTag, name);
    }
}
