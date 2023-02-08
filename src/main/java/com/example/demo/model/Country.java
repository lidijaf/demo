package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idCountry;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return idCountry == country.idCountry && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, name);
    }
}
