package com.passionproject.app.project;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String startDate;
    @Column
    private boolean commission; // is this work a commissioned piece?
    @Column
    private String dueDate; // "What is your goal deadline for this project?" if commission is false, "When is this project due?" if commission is true

    @Column
    private boolean materials; // Will you need to buy materials for this project? if materials is true, displays onHandMaterialsCost and additionalMaterialsCost
    @Column
    private Double onHandMaterialsCost; //estimate the cost of materials you have on hand that you will be using
    @Column
    private Double additionalMaterialsCost; // estimate the cost of materials you will need to buy to use
    @Column
    private Double hourlyRate;
    @Column
    private Double hoursLogged;

    @Column
    private String description;
    @Column
    private String commissioner; //will only display if commission is true
    @Column
    private String requirements; //if applicable
    @Column
    private String notes; //additional space for notes

    @Column
    private boolean complete; // want a slider on how complete it is
    @Column
    private boolean sold; // this is for personal projects that can be sold in the future if not commissioned

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean isCommission() {
        return commission;
    }

    public void setCommission(boolean commission) {
        this.commission = commission;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isMaterials() {
        return materials;
    }

    public void setMaterials(boolean materials) {
        this.materials = materials;
    }

    public Double getOnHandMaterialsCost() {
        return onHandMaterialsCost;
    }

    public void setOnHandMaterialsCost(Double onHandMaterialsCost) {
        this.onHandMaterialsCost = onHandMaterialsCost;
    }


    public Double getAdditionalMaterialsCost() {
        return additionalMaterialsCost;
    }

    public void setAdditionalMaterialsCost(Double additionalMaterialsCost) {
        this.additionalMaterialsCost = additionalMaterialsCost;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Double getHoursLogged() {
        return hoursLogged;
    }

    public void setHoursLogged(Double hoursLogged) {
        this.hoursLogged = hoursLogged;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommissioner() {
        return commissioner;
    }

    public void setCommissioner(String commissioner) {
        this.commissioner = commissioner;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
