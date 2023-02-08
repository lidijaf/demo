package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class UserRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idUserRole")
    private int idUserRole;
    @Basic
    @Column(name = "idUserProject")
    private Integer idUserProject;
    @Basic
    @Column(name = "idRole")
    private Integer idRole;

    public int getIdUserRole() {
        return idUserRole;
    }

    public void setIdUserRole(int idUserRole) {
        this.idUserRole = idUserRole;
    }

    public Integer getIdUserProject() {
        return idUserProject;
    }

    public void setIdUserProject(Integer idUserProject) {
        this.idUserProject = idUserProject;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return idUserRole == userRole.idUserRole && Objects.equals(idUserProject, userRole.idUserProject) && Objects.equals(idRole, userRole.idRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUserRole, idUserProject, idRole);
    }
}
