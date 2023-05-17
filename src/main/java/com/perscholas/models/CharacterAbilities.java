package com.perscholas.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "character_abilities")
public class CharacterAbilities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AbilitiesId;

    int accuracy;
    int communication;
    int constitution;
    int dexterity;
    int fighting;
    int intelligence;
    int perception;
    int strength;
    int willpower;

    boolean isAccuracyProficient;
    boolean isCommunicationProficient;
    boolean isConstitutionProficient;
    boolean isDexterityProficient;
    boolean isFightingProficient;
    boolean isIntelligenceProficient;
    boolean isPerceptionProficient;
    boolean isStrengthProficient;
    boolean isWillpowerProficient;

    public int getAbilitiesId() {
        return AbilitiesId;
    }

    public void setAbilitiesId(int abilitiesId) {
        AbilitiesId = abilitiesId;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(byte accuracy) {
        this.accuracy = accuracy;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(byte communication) {
        this.communication = communication;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(byte constitution) {
        this.constitution = constitution;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(byte dexterity) {
        this.dexterity = dexterity;
    }

    public int getFighting() {
        return fighting;
    }

    public void setFighting(byte fighting) {
        this.fighting = fighting;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(byte intelligence) {
        this.intelligence = intelligence;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(byte perception) {
        this.perception = perception;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(byte strength) {
        this.strength = strength;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(byte willpower) {
        this.willpower = willpower;
    }

    public boolean isAccuracyProficient() {
        return isAccuracyProficient;
    }

    public void setAccuracyProficient(boolean accuracyProficient) {
        isAccuracyProficient = accuracyProficient;
    }

    public boolean isCommunicationProficient() {
        return isCommunicationProficient;
    }

    public void setCommunicationProficient(boolean communicationProficient) {
        isCommunicationProficient = communicationProficient;
    }

    public boolean isConstitutionProficient() {
        return isConstitutionProficient;
    }

    public void setConstitutionProficient(boolean constitutionProficient) {
        isConstitutionProficient = constitutionProficient;
    }

    public boolean isDexterityProficient() {
        return isDexterityProficient;
    }

    public void setDexterityProficient(boolean dexterityProficient) {
        isDexterityProficient = dexterityProficient;
    }

    public boolean isFightingProficient() {
        return isFightingProficient;
    }

    public void setFightingProficient(boolean fightingProficient) {
        isFightingProficient = fightingProficient;
    }

    public boolean isIntelligenceProficient() {
        return isIntelligenceProficient;
    }

    public void setIntelligenceProficient(boolean intelligenceProficient) {
        isIntelligenceProficient = intelligenceProficient;
    }

    public boolean isPerceptionProficient() {
        return isPerceptionProficient;
    }

    public void setPerceptionProficient(boolean perceptionProficient) {
        isPerceptionProficient = perceptionProficient;
    }

    public boolean isStrengthProficient() {
        return isStrengthProficient;
    }

    public void setStrengthProficient(boolean strengthProficient) {
        isStrengthProficient = strengthProficient;
    }

    public boolean isWillpowerProficient() {
        return isWillpowerProficient;
    }

    public void setWillpowerProficient(boolean willpowerProficient) {
        isWillpowerProficient = willpowerProficient;
    }
}
