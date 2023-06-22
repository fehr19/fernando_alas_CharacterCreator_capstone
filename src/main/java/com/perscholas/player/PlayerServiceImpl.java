package com.perscholas.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    private Player Player;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public void savePlayer(Player Player) {
        playerRepository.save(Player);

    }

    @Override
    public Player getPlayerById(int id) {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            return optionalPlayer.get();
        }
        throw new PlayerNotFoundException();
    }

    @Override
    public void deletePlayerById(int id) {
        playerRepository.deleteById(id);
    }
}
