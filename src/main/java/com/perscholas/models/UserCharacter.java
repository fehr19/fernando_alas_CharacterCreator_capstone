package com.perscholas.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "user_characters")
public class UserCharacter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int characterId;

    @NotNull
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

    @OneToOne(targetEntity = CharacterAbilities.class, cascade = CascadeType.ALL)
    private CharacterAbilities characterAbilities;

    @OneToMany(targetEntity = Weapon.class, cascade = CascadeType.ALL)
    private List weaponsList;

    public UserCharacter() {
    }

    public UserCharacter(String name, String ancestry, String classProfession) {
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