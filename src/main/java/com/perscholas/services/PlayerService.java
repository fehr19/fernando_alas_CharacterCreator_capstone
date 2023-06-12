package com.perscholas.services;

import com.perscholas.models.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    void savePlayer (Player Player);

    Player getPlayerById(int characterId);

    void deletePlayerById(int characterId);
}
