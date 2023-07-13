package com.perscholas.playerancestry;

import com.perscholas.ancestry.Ancestry;

public interface PlayerAncestryService {
    void savePlayerAncestry(PlayerAncestry playerAncestry);

    PlayerAncestry getPlayerAncestryFromAncestry(Ancestry ancestry);
}
