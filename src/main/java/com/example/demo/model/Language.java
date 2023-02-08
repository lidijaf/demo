package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Language {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idLanguage")
    private int idLanguage;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "idCountry")
    private Integer idCountry;

    public int getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return idLanguage == language.idLanguage && Objects.equals(name, language.name) && Objects.equals(idCountry, language.idCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLanguage, name, idCountry);
    }
}
