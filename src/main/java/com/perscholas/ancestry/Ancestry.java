package com.perscholas.ancestry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// This class contains the ancestries from the book, with their stats
@Entity
public class Ancestry {
    @Id
    private int id;
    private String ancestryName;
    private int speedMod;
    private String description;



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

    public int getSpeedMod() {
        return speedMod;
    }

    public void setSpeedMod(int speedMod) {
        this.speedMod = speedMod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
