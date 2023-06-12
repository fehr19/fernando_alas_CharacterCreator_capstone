package com.perscholas.services;

import com.perscholas.models.Player;
import com.perscholas.repository.PlayerRepository;
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
    public Player getPlayerById(int characterId) {
        Optional<Player> optionalUserCharacter = playerRepository.findById(characterId);
        if (optionalUserCharacter.isPresent()) {
            Player Player = optionalUserCharacter.get();
            return Player;
        }
        throw new PlayerNotFoundException();
    }

    @Override
    public void deletePlayerById(int characterId) {
        playerRepository.deleteById(characterId);
    }
}
