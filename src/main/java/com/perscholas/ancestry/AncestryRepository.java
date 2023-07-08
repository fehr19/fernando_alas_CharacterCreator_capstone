package com.perscholas.ancestry;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AncestryRepository extends JpaRepository<Ancestry, Integer> {


    // method to find speedMod by ancestry name
    Ancestry findSpeedModByAncestryName(String ancestryName);

}
