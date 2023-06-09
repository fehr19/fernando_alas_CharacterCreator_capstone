package com.perscholas.services;

import com.perscholas.models.UserCharacter;
import java.util.List;

public interface UserCharacterService {

    List<UserCharacter> getAllUserCharacters();

    void saveUserCharacter (UserCharacter userCharacter);

    UserCharacter getUserCharacterById(int characterId);

    void deleteUserCharacterById(int characterId);
}
