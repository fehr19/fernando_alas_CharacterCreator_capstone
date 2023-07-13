package com.perscholas.player;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

    List<Player> getAllPlayers();

    void savePlayer (Player player);

    Player getPlayerById(int id);

    void deletePlayerById(int id);
    void savePlayerAncestryByAncestryId(Player player, int ancestryId);
}
