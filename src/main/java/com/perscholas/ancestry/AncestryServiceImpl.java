package com.perscholas.ancestry;

import com.perscholas.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AncestryServiceImpl implements AncestryService {

    private final AncestryRepository ancestryRepository;

    @Autowired
    public AncestryServiceImpl(AncestryRepository ancestryRepository) {
        this.ancestryRepository = ancestryRepository;
    }


    @Override
    public List<Ancestry> getAllAncestries() {
        return ancestryRepository.findAll();
    }

    @Override
    public int calculateSpeedByName(int dexterity, String name) {
        Ancestry ancestry = ancestryRepository.findSpeedModByAncestryName(name);
        return ancestry.getSpeedMod() + dexterity;
    }


}
