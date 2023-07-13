package com.perscholas.archetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchetypeServiceImpl implements ArchetypeService {

    private final ArchetypeRepository archetypeRepository;

    @Autowired
    public ArchetypeServiceImpl(ArchetypeRepository archetypeRepository) {
        this.archetypeRepository = archetypeRepository;
    }


    @Override
    public List<Archetype> getAllArchetypes() {
        return archetypeRepository.findAll();
    }

    @Override
    public Archetype getArchetypeById(int id) {
        Optional<Archetype> optionalArchetype = archetypeRepository.findById(id);
        if (optionalArchetype.isPresent()) {
            return optionalArchetype.get();
        }
        throw new ArchetypeNotFoundException();
    }

}
