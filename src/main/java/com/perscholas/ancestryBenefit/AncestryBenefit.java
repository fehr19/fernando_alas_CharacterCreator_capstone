package com.perscholas.ancestryBenefit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AncestryBenefit {
    @Id
    private String ancestryName;
    private String roll2;
    private String roll3;
    private String roll4;
    private String roll5;
    private String roll6;
    private String roll7;
    private String roll8;
    private String roll9;
    private String roll10;
    private String roll11;
    private String roll12;

    public String getAncestryName() {
        return ancestryName;
    }

    public String getRoll2() {
        return roll2;
    }

    public String getRoll3() {
        return roll3;
    }

    public String getRoll4() {
        return roll4;
    }

    public String getRoll5() {
        return roll5;
    }

    public String getRoll6() {
        return roll6;
    }

    public String getRoll7() {
        return roll7;
    }

    public String getRoll8() {
        return roll8;
    }

    public String getRoll9() {
        return roll9;
    }

    public String getRoll10() {
        return roll10;
    }

    public String getRoll11() {
        return roll11;
    }

    public String getRoll12() {
        return roll12;
    }
}
