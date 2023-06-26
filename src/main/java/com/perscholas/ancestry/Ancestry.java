package com.perscholas.ancestry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ancestry {
    @Id
    private String name;

    private String focusA;
    private String focusB;
    private boolean darkSight;
    private int speed;

    public String getName() {
        return name;
    }

    public String getFocusA() {
        return focusA;
    }

    public String getFocusB() {
        return focusB;
    }

    public boolean isDarkSight() {
        return darkSight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
