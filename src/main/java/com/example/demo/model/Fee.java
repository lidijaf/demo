package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Fee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idFee")
    private int idFee;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdFee() {
        return idFee;
    }

    public void setIdFee(int idFee) {
        this.idFee = idFee;
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
        Fee fee = (Fee) o;
        return idFee == fee.idFee && Objects.equals(name, fee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFee, name);
    }
}
