package com.passionproject.app.project;

import com.passionproject.app.commission.Commission;
import com.passionproject.app.enums.Completion;

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
    private String dueDate; // "What is your goal deadline for this project?" if commission is false, "When is this project due?" if commission is true
    @Column
    private boolean materials; // Will you need to buy materials for this project? if materials is true, displays onHandMaterialsCost and additionalMaterialsCost
    @Column
    private Double materialsCost; // estimate the cost of materials you will need to buy to use
    @Column
    private Double hourlyRate;
    @Column
    private Double hoursLogged;
    @Column
    private String description;
    @Column
    private String notes; //additional space for notes
    @Enumerated(EnumType.STRING)
    Completion completion;
    @Column
    private boolean sold; // this is for personal projects that can be sold in the future if not commissioned
    @OneToOne(cascade = CascadeType.ALL)
    private Commission commission;

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

    public Double getMaterialsCost() {
        return materialsCost;
    }

    public void setMaterialsCost(Double materialsCost) {
        this.materialsCost = materialsCost;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Completion getCompletion() {
        return completion;
    }

    public void setCompletion(Completion completion) {
        this.completion = completion;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }
}
