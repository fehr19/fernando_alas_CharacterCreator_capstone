package com.perscholas.ancestry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ancestry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ancestryName;
    private String description;
    private int speedMod;


    public Ancestry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAncestryName() {
        return ancestryName;
    }

    public void setAncestryName(String ancestryName) {
        this.ancestryName = ancestryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpeedMod() {
        return speedMod;
    }

    public void setSpeedMod(int speedMod) {
        this.speedMod = speedMod;
    }
}
