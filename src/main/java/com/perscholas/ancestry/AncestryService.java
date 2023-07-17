package com.perscholas.ancestry;

import java.util.List;

public interface AncestryService {
    // To show options from DB when choosing ancestry
    List<Ancestry> getAllAncestries();

    // Get ancestry by ID from DB to create a player ancestry
    Ancestry getAncestryById(int id);



}
