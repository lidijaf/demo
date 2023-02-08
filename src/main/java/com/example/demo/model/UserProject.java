package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class UserProject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idUserProject")
    private int idUserProject;
    @Basic
    @Column(name = "idUser")
    private Integer idUser;
    @Basic
    @Column(name = "idProject")
    private Integer idProject;

    public int getIdUserProject() {
        return idUserProject;
    }

    public void setIdUserProject(int idUserProject) {
        this.idUserProject = idUserProject;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProject that = (UserProject) o;
        return idUserProject == that.idUserProject && Objects.equals(idUser, that.idUser) && Objects.equals(idProject, that.idProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUserProject, idUser, idProject);
    }
}
