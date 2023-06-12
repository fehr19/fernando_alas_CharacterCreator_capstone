package com.perscholas.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Player_Characters")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min=2)
    @Column(name="character_name")
    private String name;
    private Integer level = null;
    private String ancestry;
    private String socialClass;
    private String background;
    private String classProfession;
    private int health;
    private int speed;
    private int defense;
    private int experience;

    @OneToOne(targetEntity = Abilities.class, cascade = CascadeType.ALL)
    private Abilities abilities;

    public Player() {
    }

    public Player(String name, String ancestry, String classProfession) {
        this.name = name;
        this.ancestry = ancestry;
        this.classProfession = classProfession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
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
