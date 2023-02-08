package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class EventGoal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ideventgoal")
    private int idEventGoal;
    @Basic
    @Column(name = "idevent")
    private Integer idEvent;
    @Basic
    @Column(name = "idgoal")
    private Integer idGoal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventGoal eventGoal = (EventGoal) o;
        return idEventGoal == eventGoal.idEventGoal && Objects.equals(idEvent, eventGoal.idEvent) && Objects.equals(idGoal, eventGoal.idGoal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEventGoal, idEvent, idGoal);
    }
}
