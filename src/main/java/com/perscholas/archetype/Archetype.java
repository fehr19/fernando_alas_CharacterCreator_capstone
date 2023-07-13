package com.perscholas.archetype;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Archetype {
    @Id
    private int id;
    private String archetypeName;
    private int healthMod;
    private String description;



    public Archetype() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArchetypeName() {
        return archetypeName;
    }

    public void setArchetypeName(String archetypeName) {
        this.archetypeName = archetypeName;
    }

    public int getHealthMod() {
        return healthMod;
    }

    public void setHealthMod(int healthMod) {
        this.healthMod = healthMod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
