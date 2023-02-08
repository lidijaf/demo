package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class EventParticipantUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEventParticipantUser")
    private int idEventParticipantUser;
    @Basic
    @Column(name = "idEvent")
    private Integer idEvent;
    @Basic
    @Column(name = "idUser")
    private Integer idUser;

    public int getIdEventParticipantUser() {
        return idEventParticipantUser;
    }

    public void setIdEventParticipantUser(int idEventParticipantUser) {
        this.idEventParticipantUser = idEventParticipantUser;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventParticipantUser that = (EventParticipantUser) o;
        return idEventParticipantUser == that.idEventParticipantUser && Objects.equals(idEvent, that.idEvent) && Objects.equals(idUser, that.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEventParticipantUser, idEvent, idUser);
    }
}
