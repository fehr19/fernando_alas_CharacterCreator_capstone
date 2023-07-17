package com.perscholas.archetype;

import java.util.List;

public interface ArchetypeService {
    // To show options from DB when choosing archetype
    List<Archetype> getAllArchetypes();

    // Get archetype by ID from DB to create a player archetype
    Archetype getArchetypeById(int id);



}
