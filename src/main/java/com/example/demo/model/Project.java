package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Project {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProject")
    private int idProject;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return idProject == project.idProject && Objects.equals(name, project.name) && Objects.equals(description, project.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProject, name, description);
    }
}
