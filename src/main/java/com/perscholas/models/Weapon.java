package com.perscholas.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Weapon implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name="CharacterId", nullable=false)
    private Character character;
    private String weaponGroup;
    private String weaponName;
    private String damage;
    private int minStrength;
    private boolean isRanged;
    //find a place to define ranged weapon fields


    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponGroup() {
        return weaponGroup;
    }

    public void setWeaponGroup(String weaponGroup) {
        this.weaponGroup = weaponGroup;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public void setMinStrength(int minStrength) {
        this.minStrength = minStrength;
    }

    public boolean isRanged() {
        return isRanged;
    }

    public void setRanged(boolean ranged) {
        isRanged = ranged;
    }
}
