package com.perscholas.playerancestry;

import com.perscholas.ancestry.Ancestry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerAncestryServiceImpl implements PlayerAncestryService{
    private final PlayerAncestryRepository playerAncestryRepository;

    @Autowired
    public PlayerAncestryServiceImpl(PlayerAncestryRepository playerAncestryRepository) {
        this.playerAncestryRepository = playerAncestryRepository;
    }

    @Override
    public void savePlayerAncestry(PlayerAncestry playerAncestry) {
        playerAncestryRepository.save(playerAncestry);

    }

    @Override
    public PlayerAncestry getPlayerAncestryFromAncestry(Ancestry ancestry) {
        PlayerAncestry playerAncestry = new PlayerAncestry();
        playerAncestry.setAncestryId(ancestry.getId());
        playerAncestry.setName(ancestry.getAncestryName());
        playerAncestry.setSpeedMod(ancestry.getSpeedMod());

        return playerAncestry;
    }
}
