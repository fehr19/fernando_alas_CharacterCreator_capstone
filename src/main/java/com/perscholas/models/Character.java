package com.perscholas.models;

public class Character {
    private String name;
    private byte level;
    private String ancestry;
    private String socialClass;
    private String background;
    private String classProfession;
    private short health;
    private short speed;
    private short defense;
    private int experience;

    public Character() {
    }

    public Character(String name, String ancestry, String classProfession) {
        this.name = name;
        this.ancestry = ancestry;
        this.classProfession = classProfession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
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

    public short getHealth() {
        return health;
    }

    public void setHealth(short health) {
        this.health = health;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getDefense() {
        return defense;
    }

    public void setDefense(short defense) {
        this.defense = defense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
