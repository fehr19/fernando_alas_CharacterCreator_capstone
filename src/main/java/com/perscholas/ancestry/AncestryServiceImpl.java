package com.perscholas.ancestry;

import com.perscholas.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AncestryServiceImpl implements AncestryService {

    private AncestryRepository ancestryRepository;

    @Autowired
    public AncestryServiceImpl(AncestryRepository ancestryRepository) {
        this.ancestryRepository = ancestryRepository;
    }

    @Override
    public List<Ancestry> getAllAncestries() {
        return ancestryRepository.findAll();
    }


    /* this varies by Ancestry, need to find a way to
     make that possible, either different AncestryServiceImpl,
     or various methods by ancestry in this class
     maybe pass the ancestry id to find the int modifier*/
    @Override
    public int calculateSpeed(Player player, Ancestry ancestry) {
        return ancestry.getSpeedMod() + player.getDexterity();
    }


}
