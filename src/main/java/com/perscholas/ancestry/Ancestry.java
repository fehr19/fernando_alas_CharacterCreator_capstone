package com.perscholas.ancestry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ancestry {
    @Id
    String name;
    String description;
    private int speed;

}
