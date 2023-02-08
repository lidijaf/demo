package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Farm {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idFarm")
    private int idFarm;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "approved")
    private Boolean approved;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "size")
    private Double size;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "views")
    private Long views;
    @Basic
    @Column(name = "organic")
    private Boolean organic;
    @Basic
    @Column(name = "website")
    private String website;
    @Basic
    @Column(name = "twitter")
    private String twitter;
    @Basic
    @Column(name = "facebook")
    private String facebook;
    @Basic
    @Column(name = "instagram")
    private String instagram;
    @Basic
    @Column(name = "idFarmType")
    private Integer idFarmType;
    @Basic
    @Column(name = "idCountry")
    private Integer idCountry;
    @Basic
    @Column(name = "idThematicArea")
    private Integer idThematicArea;
    @Basic
    @Column(name = "idUserAdded")
    private Integer idUserAdded;
    @Basic
    @Column(name = "idUserOwner")
    private Integer idUserOwner;
    @Basic
    @Column(name = "idProject")
    private Integer idProject;
    @Basic
    @Column(name = "contactName")
    private String contactName;
    @Basic
    @Column(name = "contactPhone")
    private String contactPhone;
    @Basic
    @Column(name = "contactEmail")
    private String contactEmail;

    public int getIdFarm() {
        return idFarm;
    }

    public void setIdFarm(int idFarm) {
        this.idFarm = idFarm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Boolean getOrganic() {
        return organic;
    }

    public void setOrganic(Boolean organic) {
        this.organic = organic;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public Integer getIdFarmType() {
        return idFarmType;
    }

    public void setIdFarmType(Integer idFarmType) {
        this.idFarmType = idFarmType;
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

    public Integer getIdUserAdded() {
        return idUserAdded;
    }

    public void setIdUserAdded(Integer idUserAdded) {
        this.idUserAdded = idUserAdded;
    }

    public Integer getIdUserOwner() {
        return idUserOwner;
    }

    public void setIdUserOwner(Integer idUserOwner) {
        this.idUserOwner = idUserOwner;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farm farm = (Farm) o;
        return idFarm == farm.idFarm && Objects.equals(name, farm.name) && Objects.equals(approved, farm.approved) && Objects.equals(address, farm.address) && Objects.equals(size, farm.size) && Objects.equals(description, farm.description) && Objects.equals(views, farm.views) && Objects.equals(organic, farm.organic) && Objects.equals(website, farm.website) && Objects.equals(twitter, farm.twitter) && Objects.equals(facebook, farm.facebook) && Objects.equals(instagram, farm.instagram) && Objects.equals(idFarmType, farm.idFarmType) && Objects.equals(idCountry, farm.idCountry) && Objects.equals(idThematicArea, farm.idThematicArea) && Objects.equals(idUserAdded, farm.idUserAdded) && Objects.equals(idUserOwner, farm.idUserOwner) && Objects.equals(idProject, farm.idProject) && Objects.equals(contactName, farm.contactName) && Objects.equals(contactPhone, farm.contactPhone) && Objects.equals(contactEmail, farm.contactEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFarm, name, approved, address, size, description, views, organic, website, twitter, facebook, instagram, idFarmType, idCountry, idThematicArea, idUserAdded, idUserOwner, idProject, contactName, contactPhone, contactEmail);
    }
}
