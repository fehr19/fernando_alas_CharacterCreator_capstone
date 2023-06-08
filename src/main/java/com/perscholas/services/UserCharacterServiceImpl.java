package com.perscholas.services;

import com.perscholas.models.UserCharacter;
import com.perscholas.repository.UserCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserCharacterServiceImpl implements UserCharacterService {

    private UserCharacterRepository userCharacterRepository;

    private UserCharacter userCharacter;

    @Autowired
    public UserCharacterServiceImpl(UserCharacterRepository userCharacterRepository) {
        this.userCharacterRepository = userCharacterRepository;
    }

    @Override
    public List<UserCharacter> getAllUserCharacters() {
        return null;
    }

    @Override
    public void saveUserCharacter(UserCharacter userCharacter) {

    }

    @Override
    public UserCharacter getUserCharacterById(int id) {
        return null;
    }

    @Override
    public void deleteUserCharacterById(int id) {

    }
}
