package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class KnowledgeObjectTag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idKnowledgeObjectTag")
    private int idKnowledgeObjectTag;
    @Basic
    @Column(name = "idKnowledgeObject")
    private Integer idKnowledgeObject;
    @Basic
    @Column(name = "idTag")
    private Integer idTag;

    public int getIdKnowledgeObjectTag() {
        return idKnowledgeObjectTag;
    }

    public void setIdKnowledgeObjectTag(int idKnowledgeObjectTag) {
        this.idKnowledgeObjectTag = idKnowledgeObjectTag;
    }

    public Integer getIdKnowledgeObject() {
        return idKnowledgeObject;
    }

    public void setIdKnowledgeObject(Integer idKnowledgeObject) {
        this.idKnowledgeObject = idKnowledgeObject;
    }

    public Integer getIdTag() {
        return idTag;
    }

    public void setIdTag(Integer idTag) {
        this.idTag = idTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnowledgeObjectTag that = (KnowledgeObjectTag) o;
        return idKnowledgeObjectTag == that.idKnowledgeObjectTag && Objects.equals(idKnowledgeObject, that.idKnowledgeObject) && Objects.equals(idTag, that.idTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKnowledgeObjectTag, idKnowledgeObject, idTag);
    }
}
