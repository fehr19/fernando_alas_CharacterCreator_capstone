package com.perscholas.player;

import com.perscholas.ancestry.Ancestry;
import com.perscholas.playerArchetype.PlayerArchetype;
import com.perscholas.playerancestry.PlayerAncestry;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Player_Characters")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min=2, message="Name must be at least 2 characters long")
    @Column(name="character_name")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PlayerAncestry_id")
    private PlayerAncestry playerAncestry;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PlayerArchetype_id")
    private PlayerArchetype playerArchetype;
    private int health;
    private int defense;
    private int speed;

    // Abilities
    int accuracy;
    int communication;
    int constitution;
    int dexterity;
    int fighting;
    int intelligence;
    int perception;
    int strength;
    int willpower;

    public Player() {
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

    public PlayerAncestry getPlayerAncestry() {
        return playerAncestry;
    }

    public void setPlayerAncestry(PlayerAncestry playerAncestry) {
        this.playerAncestry = playerAncestry;
    }

    public PlayerArchetype getPlayerArchetype() {
        return playerArchetype;
    }

    public void setPlayerArchetype(PlayerArchetype playerArchetype) {
        this.playerArchetype = playerArchetype;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getFighting() {
        return fighting;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }


    public void addPlayerAncestryToPlayer(PlayerAncestry playerAncestry) {
        this.setPlayerAncestry(playerAncestry);
        this.setSpeed(playerAncestry.getSpeedMod() + this.getDexterity());
    }

    public void addPlayerArchetypeToPlayer(PlayerArchetype playerArchetype) {
        this.setPlayerArchetype(playerArchetype);
        this.setHealth(playerArchetype.getHealthMod() + this.getConstitution());
    }


    // TODO insert method to calculate defense
}
