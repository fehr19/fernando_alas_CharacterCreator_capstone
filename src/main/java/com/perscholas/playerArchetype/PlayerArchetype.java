package com.perscholas.playerArchetype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerArchetype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int archetypeId;
    private String name;
    private int healthMod;

    public PlayerArchetype() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArchetypeId() {
        return archetypeId;
    }

    public void setArchetypeId(int archetypeId) {
        this.archetypeId = archetypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthMod() {
        return healthMod;
    }

    public void setHealthMod(int healthMod) {
        this.healthMod = healthMod;
    }
}
