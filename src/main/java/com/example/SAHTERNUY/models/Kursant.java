package com.example.SAHTERNUY.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kursant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mil_rank;
    private String name;
    private String lastName;
    private int total_lessons;
    private int total_attended;
    private int total_missed;
    private int total_late;
    private long unitId;

    public Kursant(String mil_rank, String name, String lastName, int total_lessons, int total_attended, int total_missed, int total_late, long unitId) {
        this.mil_rank = mil_rank;
        this.name = name;
        this.lastName = lastName;
        this.total_lessons = total_lessons;
        this.total_attended = total_attended;
        this.total_missed = total_missed;
        this.total_late = total_late;
        this.unitId = unitId;
    }

    public Kursant() {
    }

    public long getUnitId() {
        return unitId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public long getId() {
        return id;
    }

    public String getMil_rank() {
        return mil_rank;
    }

    public void setMil_rank(String mil_rank) {
        this.mil_rank = mil_rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotal_lessons() {
        return total_lessons;
    }

    public void setTotal_lessons(int total_lessons) {
        this.total_lessons = total_lessons;
    }

    public int getTotal_attended() {
        return total_attended;
    }

    public void setTotal_attended(int total_attended) {
        this.total_attended = total_attended;
    }

    public int getTotal_missed() {
        return total_missed;
    }

    public void setTotal_missed(int total_missed) {
        this.total_missed = total_missed;
    }

    public int getTotal_late() {
        return total_late;
    }

    public void setTotal_late(int total_late) {
        this.total_late = total_late;
    }
}
