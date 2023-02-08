package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Goal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idGoal")
    private int idGoal;
    @Basic
    @Column(name = "name")
    private String name;

    public int getIdGoal() {
        return idGoal;
    }

    public void setIdGoal(int idGoal) {
        this.idGoal = idGoal;
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
        Goal goal = (Goal) o;
        return idGoal == goal.idGoal && Objects.equals(name, goal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGoal, name);
    }
}
