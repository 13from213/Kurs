package com.example.SAHTERNUY.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public Unit() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}