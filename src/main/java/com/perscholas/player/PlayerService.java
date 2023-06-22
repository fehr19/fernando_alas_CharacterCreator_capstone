package com.perscholas.player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    void savePlayer (Player Player);

    Player getPlayerById(int id);

    void deletePlayerById(int id);
}
