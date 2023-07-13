package com.perscholas.player;

import com.perscholas.ancestry.Ancestry;
import com.perscholas.ancestry.AncestryService;
import com.perscholas.ancestry.AncestryServiceImpl;
import com.perscholas.playerancestry.PlayerAncestry;
import com.perscholas.playerancestry.PlayerAncestryRepository;
import com.perscholas.playerancestry.PlayerAncestryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerAncestryService playerAncestryService;
    private final AncestryService ancestryService;


    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository, PlayerAncestryService playerAncestryService, AncestryService ancestryService) {
        this.playerRepository = playerRepository;
        this.playerAncestryService = playerAncestryService;
        this.ancestryService = ancestryService;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public void savePlayer(Player player) {
        playerRepository.save(player);
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

    @Override
    public void savePlayerAncestryByAncestryId(Player player, int ancestryId) {
        Ancestry ancestry = ancestryService.getAncestryById(ancestryId);
        PlayerAncestry playerAncestry = playerAncestryService.getPlayerAncestryFromAncestry(ancestry);
        player.addPlayerAncestryToPlayer(playerAncestry);
        playerAncestryService.savePlayerAncestry(playerAncestry);

    }


}
