package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ThematicArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idThematicArea")
    private int idThematicArea;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "imagePath")
    private String imagePath;

    public int getIdThematicArea() {
        return idThematicArea;
    }

    public void setIdThematicArea(int idThematicArea) {
        this.idThematicArea = idThematicArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThematicArea that = (ThematicArea) o;
        return idThematicArea == that.idThematicArea && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(imagePath, that.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idThematicArea, name, description, imagePath);
    }
}
