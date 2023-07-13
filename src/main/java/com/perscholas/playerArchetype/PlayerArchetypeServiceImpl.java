package com.perscholas.playerArchetype;

import com.perscholas.archetype.Archetype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerArchetypeServiceImpl implements PlayerArchetypeService{

    private final PlayerArchetypeRepository playerArchetypeRepository;

    @Autowired
    public PlayerArchetypeServiceImpl(PlayerArchetypeRepository playerArchetypeRepository) {
        this.playerArchetypeRepository = playerArchetypeRepository;
    }

    @Override
    public void savePlayerArchetype(PlayerArchetype playerArchetype) {
        playerArchetypeRepository.save(playerArchetype);
    }

    @Override
    public PlayerArchetype getPlayerArchetypeFromArchetype(Archetype archetype) {
        PlayerArchetype playerArchetype = new PlayerArchetype();
        playerArchetype.setArchetypeId(archetype.getId());
        playerArchetype.setName(archetype.getArchetypeName());
        playerArchetype.setHealthMod(archetype.getHealthMod());

        return playerArchetype;
    }
}
