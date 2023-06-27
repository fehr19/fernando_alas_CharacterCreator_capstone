package com.perscholas.ancestry;

import com.perscholas.player.Player;
import com.perscholas.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AncestryServiceImpl implements AncestryService{

    private AncestryRepository ancestryRepository;
    private PlayerRepository playerRepository;
    private Ancestry ancestry;
    private Player player;

    @Autowired
    public AncestryServiceImpl(AncestryRepository ancestryRepository, PlayerRepository playerRepository) {
        this.ancestryRepository = ancestryRepository;
        this.playerRepository = playerRepository;
    }

    @Override
    public int calculateSpeed(Player player) {
        int speed = 10 + player.getDexterity();

        return speed;
    }

    @Override
    public List<String> getAncestryBenefitsById(Player player) {

        return null;
    }
}
