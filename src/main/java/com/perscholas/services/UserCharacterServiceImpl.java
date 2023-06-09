package com.perscholas.services;

import com.perscholas.models.UserCharacter;
import com.perscholas.repository.UserCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCharacterServiceImpl implements UserCharacterService {

    private UserCharacterRepository userCharacterRepository;

    private UserCharacter userCharacter;

    @Autowired
    public UserCharacterServiceImpl(UserCharacterRepository userCharacterRepository) {
        this.userCharacterRepository = userCharacterRepository;
    }

    @Override
    public List<UserCharacter> getAllUserCharacters() {
        return userCharacterRepository.findAll();
    }

    @Override
    public void saveUserCharacter(UserCharacter userCharacter) {
        userCharacterRepository.save(userCharacter);

    }

    @Override
    public UserCharacter getUserCharacterById(int characterId) {
        return null;
    }

    @Override
    public void deleteUserCharacterById(int characterId) {
        userCharacterRepository.deleteById(characterId);
    }
}
