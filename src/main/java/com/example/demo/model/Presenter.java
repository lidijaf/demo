package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Presenter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPresenter")
    private int idPresenter;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdPresenter() {
        return idPresenter;
    }

    public void setIdPresenter(int idPresenter) {
        this.idPresenter = idPresenter;
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
        Presenter presenter = (Presenter) o;
        return idPresenter == presenter.idPresenter && Objects.equals(name, presenter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPresenter, name);
    }
}
