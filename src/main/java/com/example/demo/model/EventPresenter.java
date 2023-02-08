package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class EventPresenter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEventPresenter")
    private int idEventPresenter;
    @Basic
    @Column(name = "idEvent")
    private Integer idEvent;
    @Basic
    @Column(name = "idPresenter")
    private Integer idPresenter;

    public int getIdEventPresenter() {
        return idEventPresenter;
    }

    public void setIdEventPresenter(int idEventPresenter) {
        this.idEventPresenter = idEventPresenter;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public Integer getIdPresenter() {
        return idPresenter;
    }

    public void setIdPresenter(Integer idPresenter) {
        this.idPresenter = idPresenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventPresenter that = (EventPresenter) o;
        return idEventPresenter == that.idEventPresenter && Objects.equals(idEvent, that.idEvent) && Objects.equals(idPresenter, that.idPresenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEventPresenter, idEvent, idPresenter);
    }
}
