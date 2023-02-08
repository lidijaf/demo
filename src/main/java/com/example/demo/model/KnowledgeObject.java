package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class KnowledgeObject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idKnowledgeObject")
    private int idKnowledgeObject;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "path")
    private String path;
    @Basic
    @Column(name = "dateCreated")
    private Timestamp dateCreated;
    @Basic
    @Column(name = "dateUpdated")
    private Timestamp dateUpdated;
    @Basic
    @Column(name = "downloads")
    private Long downloads;
    @Basic
    @Column(name = "opened")
    private long opened;
    @Basic
    @Column(name = "idKnowledgeObjectType")
    private Integer idKnowledgeObjectType;
    @Basic
    @Column(name = "idFarm")
    private Integer idFarm;
    @Basic
    @Column(name = "idEvent")
    private Integer idEvent;
    @Basic
    @Column(name = "idUser")
    private Integer idUser;
    @Basic
    @Column(name = "idCountry")
    private Integer idCountry;
    @Basic
    @Column(name = "idThematicArea")
    private Integer idThematicArea;

    public int getIdKnowledgeObject() {
        return idKnowledgeObject;
    }

    public void setIdKnowledgeObject(int idKnowledgeObject) {
        this.idKnowledgeObject = idKnowledgeObject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Timestamp dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public long getOpened() {
        return opened;
    }

    public void setOpened(long opened) {
        this.opened = opened;
    }

    public Integer getIdKnowledgeObjectType() {
        return idKnowledgeObjectType;
    }

    public void setIdKnowledgeObjectType(Integer idKnowledgeObjectType) {
        this.idKnowledgeObjectType = idKnowledgeObjectType;
    }

    public Integer getIdFarm() {
        return idFarm;
    }

    public void setIdFarm(Integer idFarm) {
        this.idFarm = idFarm;
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

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdThematicArea() {
        return idThematicArea;
    }

    public void setIdThematicArea(Integer idThematicArea) {
        this.idThematicArea = idThematicArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnowledgeObject that = (KnowledgeObject) o;
        return idKnowledgeObject == that.idKnowledgeObject && opened == that.opened && Objects.equals(title, that.title) && Objects.equals(path, that.path) && Objects.equals(dateCreated, that.dateCreated) && Objects.equals(dateUpdated, that.dateUpdated) && Objects.equals(downloads, that.downloads) && Objects.equals(idKnowledgeObjectType, that.idKnowledgeObjectType) && Objects.equals(idFarm, that.idFarm) && Objects.equals(idEvent, that.idEvent) && Objects.equals(idUser, that.idUser) && Objects.equals(idCountry, that.idCountry) && Objects.equals(idThematicArea, that.idThematicArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKnowledgeObject, title, path, dateCreated, dateUpdated, downloads, opened, idKnowledgeObjectType, idFarm, idEvent, idUser, idCountry, idThematicArea);
    }
}
