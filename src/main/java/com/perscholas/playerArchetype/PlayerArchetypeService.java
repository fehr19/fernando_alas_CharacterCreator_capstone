package com.perscholas.playerArchetype;

import com.perscholas.archetype.Archetype;

public interface PlayerArchetypeService {
    void savePlayerArchetype(PlayerArchetype playerArchetype);

    PlayerArchetype getPlayerArchetypeFromArchetype(Archetype archetype);
}
