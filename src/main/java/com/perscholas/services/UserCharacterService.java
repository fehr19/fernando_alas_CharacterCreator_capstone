package com.perscholas.services;

import com.perscholas.models.UserCharacter;

import java.util.List;

public interface UserCharacterService {
    static UserCharacter getUserCharacterById(long characterId) {
        return null;
    }

    List<UserCharacter> getAllUserCharacters();

    void saveUserCharacter (UserCharacter userCharacter);

    UserCharacter getUserCharacterById(int id);

    void deleteUserCharacterById(int id);
}
