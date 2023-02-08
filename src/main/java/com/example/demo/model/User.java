package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idUser")
    private int idUser;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "approved")
    private Boolean approved;
    @Basic
    @Column(name = "idCountry")
    private Integer idCountry;
    @Basic
    @Column(name = "registrationDate")
    private Date registrationDate;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser && Objects.equals(name, user.name) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(approved, user.approved) && Objects.equals(idCountry, user.idCountry) && Objects.equals(registrationDate, user.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, username, password, phone, email, approved, idCountry, registrationDate);
    }
}
