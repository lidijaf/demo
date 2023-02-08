package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class EventLanguage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEventLanguage")
    private int idEventLanguage;
    @Basic
    @Column(name = "idEvent")
    private Integer idEvent;
    @Basic
    @Column(name = "idLanguage")
    private Integer idLanguage;

    public int getIdEventLanguage() {
        return idEventLanguage;
    }

    public void setIdEventLanguage(int idEventLanguage) {
        this.idEventLanguage = idEventLanguage;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public Integer getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(Integer idLanguage) {
        this.idLanguage = idLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventLanguage that = (EventLanguage) o;
        return idEventLanguage == that.idEventLanguage && Objects.equals(idEvent, that.idEvent) && Objects.equals(idLanguage, that.idLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEventLanguage, idEvent, idLanguage);
    }
}
