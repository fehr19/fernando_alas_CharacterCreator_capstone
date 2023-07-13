package com.perscholas.ancestry;

import java.util.List;

public interface AncestryService {
    List<Ancestry> getAllAncestries();

    Ancestry getAncestryById(int id);



}
