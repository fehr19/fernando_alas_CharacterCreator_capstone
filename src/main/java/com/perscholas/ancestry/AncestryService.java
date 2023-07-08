package com.perscholas.ancestry;

import java.util.List;

public interface AncestryService {
    List<Ancestry> getAllAncestries();

    int calculateSpeedByName(int dexterity, String name);



}
