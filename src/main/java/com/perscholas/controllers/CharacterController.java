package com.perscholas.controllers;

import com.perscholas.models.UserCharacter;
import com.perscholas.services.UserCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CharacterController {

    private UserCharacterService userCharacterService;

    public CharacterController() {

    }

    @Autowired
    public CharacterController(UserCharacterService userCharacterService) {
        this.userCharacterService = userCharacterService;
    }

    @GetMapping("/listCharacters")
    public String getAllUserCharacters(Model model) {
        model.addAttribute("listCharacters", userCharacterService.getAllUserCharacters());
        return "listCharacters";
    }

    @GetMapping("/showUpdateCharacterForm/{characterId}")
    public String showUpdateCharacterForm(@PathVariable long characterId, Model model) {
        UserCharacter userCharacter = UserCharacterService.getUserCharacterById(characterId);
        model.addAttribute("userCharacter", userCharacter);
        return "updateCharacter";
    }

}
