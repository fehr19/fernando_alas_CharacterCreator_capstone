package com.perscholas.ancestryBenefits;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AncestryBenefits {
    @Id
    private String ancestryName;

    private String roll2;
    private String roll3;
    private String roll4;
    private String roll5;


}
