package com.perscholas.ancestry;

import com.perscholas.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Ancestry getAncestryById(int id) {
        Optional<Ancestry> optionalAncestry = ancestryRepository.findById(id);
        if (optionalAncestry.isPresent()) {
            return optionalAncestry.get();
        }
        throw new AncestryNotFoundException();
    }


}
