package com.perscholas.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
public class Character implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int characterId;
    String name;
    int level;
    String ancestry;
    String socialClass;
    String background;
    String classProfession;
    int health;
    int speed;
    int defense;
    int experience;

    //@OneToOne(cascade = CascadeType.ALL)
    //private CharacterAbilities characterAbilities;

    //@OneToMany(targetEntity = Weapon.class, cascade = CascadeType.ALL)
    //private List weaponsList;

    public Character() {
    }

    public Character(String name, String ancestry, String classProfession) {
        this.name = name;
        this.ancestry = ancestry;
        this.classProfession = classProfession;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getSocialClass() {
        return socialClass;
    }

    public void setSocialClass(String socialClass) {
        this.socialClass = socialClass;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getClassProfession() {
        return classProfession;
    }

    public void setClassProfession(String classProfession) {
        this.classProfession = classProfession;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
