package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Event {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEvent")
    private int idEvent;
    @Basic
    @Column(name = "startDate")
    private Timestamp startDate;
    @Basic
    @Column(name = "endDate")
    private Timestamp endDate;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "eventLink")
    private String eventLink;
    @Basic
    @Column(name = "organiser")
    private String organiser;
    @Basic
    @Column(name = "organiserEmail")
    private String organiserEmail;
    @Basic
    @Column(name = "organiserPhone(1024)")
    private String organiserPhone1024;
    @Basic
    @Column(name = "contentsObjectives")
    private String contentsObjectives;
    @Basic
    @Column(name = "agenda")
    private String agenda;
    @Basic
    @Column(name = "views")
    private Long views;
    @Basic
    @Column(name = "idCountry")
    private Integer idCountry;
    @Basic
    @Column(name = "idThematicArea")
    private Integer idThematicArea;
    @Basic
    @Column(name = "idAudience")
    private Integer idAudience;
    @Basic
    @Column(name = "idDemonstrationMethod")
    private Integer idDemonstrationMethod;
    @Basic
    @Column(name = "idParticipantSelectionCriteria")
    private Integer idParticipantSelectionCriteria;
    @Basic
    @Column(name = "idProject")
    private Integer idProject;
    @Basic
    @Column(name = "idFarm")
    private Integer idFarm;
    @Basic
    @Column(name = "idTargetGroup")
    private Integer idTargetGroup;
    @Basic
    @Column(name = "eventLocation")
    private String eventLocation;
    @Basic
    @Column(name = "eventAddress")
    private String eventAddress;
    @Basic
    @Column(name = "idUserAdded")
    private Integer idUserAdded;
    @Basic
    @Column(name = "idUserOrganiser")
    private Integer idUserOrganiser;
    @Basic
    @Column(name = "idFee")
    private Integer idFee;
    @Basic
    @Column(name = "registrationDeadline")
    private Date registrationDeadline;
    @Basic
    @Column(name = "expectedNumParticipants")
    private Integer expectedNumParticipants;
    @Basic
    @Column(name = "afterEventSpecified")
    private Boolean afterEventSpecified;
    @Basic
    @Column(name = "additionalComments")
    private String additionalComments;

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventLink() {
        return eventLink;
    }

    public void setEventLink(String eventLink) {
        this.eventLink = eventLink;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getOrganiserEmail() {
        return organiserEmail;
    }

    public void setOrganiserEmail(String organiserEmail) {
        this.organiserEmail = organiserEmail;
    }

    public String getOrganiserPhone1024() {
        return organiserPhone1024;
    }

    public void setOrganiserPhone1024(String organiserPhone1024) {
        this.organiserPhone1024 = organiserPhone1024;
    }

    public String getContentsObjectives() {
        return contentsObjectives;
    }

    public void setContentsObjectives(String contentsObjectives) {
        this.contentsObjectives = contentsObjectives;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
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

    public Integer getIdAudience() {
        return idAudience;
    }

    public void setIdAudience(Integer idAudience) {
        this.idAudience = idAudience;
    }

    public Integer getIdDemonstrationMethod() {
        return idDemonstrationMethod;
    }

    public void setIdDemonstrationMethod(Integer idDemonstrationMethod) {
        this.idDemonstrationMethod = idDemonstrationMethod;
    }

    public Integer getIdParticipantSelectionCriteria() {
        return idParticipantSelectionCriteria;
    }

    public void setIdParticipantSelectionCriteria(Integer idParticipantSelectionCriteria) {
        this.idParticipantSelectionCriteria = idParticipantSelectionCriteria;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public Integer getIdFarm() {
        return idFarm;
    }

    public void setIdFarm(Integer idFarm) {
        this.idFarm = idFarm;
    }

    public Integer getIdTargetGroup() {
        return idTargetGroup;
    }

    public void setIdTargetGroup(Integer idTargetGroup) {
        this.idTargetGroup = idTargetGroup;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public Integer getIdUserAdded() {
        return idUserAdded;
    }

    public void setIdUserAdded(Integer idUserAdded) {
        this.idUserAdded = idUserAdded;
    }

    public Integer getIdUserOrganiser() {
        return idUserOrganiser;
    }

    public void setIdUserOrganiser(Integer idUserOrganiser) {
        this.idUserOrganiser = idUserOrganiser;
    }

    public Integer getIdFee() {
        return idFee;
    }

    public void setIdFee(Integer idFee) {
        this.idFee = idFee;
    }

    public Date getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(Date registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public Integer getExpectedNumParticipants() {
        return expectedNumParticipants;
    }

    public void setExpectedNumParticipants(Integer expectedNumParticipants) {
        this.expectedNumParticipants = expectedNumParticipants;
    }

    public Boolean getAfterEventSpecified() {
        return afterEventSpecified;
    }

    public void setAfterEventSpecified(Boolean afterEventSpecified) {
        this.afterEventSpecified = afterEventSpecified;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return idEvent == event.idEvent && Objects.equals(startDate, event.startDate) && Objects.equals(endDate, event.endDate) && Objects.equals(location, event.location) && Objects.equals(title, event.title) && Objects.equals(description, event.description) && Objects.equals(eventLink, event.eventLink) && Objects.equals(organiser, event.organiser) && Objects.equals(organiserEmail, event.organiserEmail) && Objects.equals(organiserPhone1024, event.organiserPhone1024) && Objects.equals(contentsObjectives, event.contentsObjectives) && Objects.equals(agenda, event.agenda) && Objects.equals(views, event.views) && Objects.equals(idCountry, event.idCountry) && Objects.equals(idThematicArea, event.idThematicArea) && Objects.equals(idAudience, event.idAudience) && Objects.equals(idDemonstrationMethod, event.idDemonstrationMethod) && Objects.equals(idParticipantSelectionCriteria, event.idParticipantSelectionCriteria) && Objects.equals(idProject, event.idProject) && Objects.equals(idFarm, event.idFarm) && Objects.equals(idTargetGroup, event.idTargetGroup) && Objects.equals(eventLocation, event.eventLocation) && Objects.equals(eventAddress, event.eventAddress) && Objects.equals(idUserAdded, event.idUserAdded) && Objects.equals(idUserOrganiser, event.idUserOrganiser) && Objects.equals(idFee, event.idFee) && Objects.equals(registrationDeadline, event.registrationDeadline) && Objects.equals(expectedNumParticipants, event.expectedNumParticipants) && Objects.equals(afterEventSpecified, event.afterEventSpecified) && Objects.equals(additionalComments, event.additionalComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvent, startDate, endDate, location, title, description, eventLink, organiser, organiserEmail, organiserPhone1024, contentsObjectives, agenda, views, idCountry, idThematicArea, idAudience, idDemonstrationMethod, idParticipantSelectionCriteria, idProject, idFarm, idTargetGroup, eventLocation, eventAddress, idUserAdded, idUserOrganiser, idFee, registrationDeadline, expectedNumParticipants, afterEventSpecified, additionalComments);
    }
}
