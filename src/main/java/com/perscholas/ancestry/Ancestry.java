package com.perscholas.ancestry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ancestry {
    @Id
    private String ancestryName;
    private String description;
    private int speedMod;

    public String getAncestryName() {
        return ancestryName;
    }

    public String getDescription() {
        return description;
    }

    public int getSpeedMod() {
        return speedMod;
    }

}
