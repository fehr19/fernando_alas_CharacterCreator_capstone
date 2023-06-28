package com.perscholas.ancestry;

import com.perscholas.player.Player;

import java.util.List;

public interface AncestryService {
    List<Ancestry> getAllAncestries();
    int calculateSpeed(Player player, Ancestry ancestry);




}
