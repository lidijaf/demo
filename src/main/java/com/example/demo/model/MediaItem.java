package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class MediaItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMediaItem")
    private int idMediaItem;
    @Basic
    @Column(name = "path")
    private String path;
    @Basic
    @Column(name = "idEvent")
    private Integer idEvent;
    @Basic
    @Column(name = "idFarm")
    private Integer idFarm;
    @Basic
    @Column(name = "type")
    private String type;

    public int getIdMediaItem() {
        return idMediaItem;
    }

    public void setIdMediaItem(int idMediaItem) {
        this.idMediaItem = idMediaItem;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public Integer getIdFarm() {
        return idFarm;
    }

    public void setIdFarm(Integer idFarm) {
        this.idFarm = idFarm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaItem mediaItem = (MediaItem) o;
        return idMediaItem == mediaItem.idMediaItem && Objects.equals(path, mediaItem.path) && Objects.equals(idEvent, mediaItem.idEvent) && Objects.equals(idFarm, mediaItem.idFarm) && Objects.equals(type, mediaItem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMediaItem, path, idEvent, idFarm, type);
    }
}
