package com.perscholas.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbilitiesServiceImpl implements AbilitiesService {

    private AbilitiesRepository abilitiesRepository;
    private Abilities abilities;

    @Autowired
    public AbilitiesServiceImpl(AbilitiesRepository abilitiesRepository) {
        this.abilitiesRepository = abilitiesRepository;
    }

    @Override
    public void saveAbilities(Abilities abilities) {

    }

    @Override
    public Abilities getAbilitiesById(int id) {
        return null;
    }
}
