package com.perscholas.controllers;

import com.perscholas.models.UserCharacter;
import com.perscholas.services.UserCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CharacterController {

    private UserCharacterService userCharacterService;

    public CharacterController() {

    }

    @Autowired
    public CharacterController(UserCharacterService userCharacterService) {
        this.userCharacterService = userCharacterService;
    }

    @GetMapping("/")
    public String getAllUserCharacters(Model model) {
        model.addAttribute("listCharacters", userCharacterService.getAllUserCharacters());
        return "home";
    }

    @GetMapping("/showNewCharacterForm")
    public String showNewCharacterForm(Model model) {
        UserCharacter userCharacter = new UserCharacter();
        model.addAttribute("userCharacter", userCharacter);
        return "newUserCharacter";
    }

    @GetMapping("/showUpdateCharacterForm/{characterId}")
    public String showUpdateCharacterForm(@PathVariable int characterId, Model model) {
        UserCharacter userCharacter = userCharacterService.getUserCharacterById(characterId);
        model.addAttribute("userCharacter", userCharacter);
        return "updateCharacter";
    }

    @PostMapping("/saveCharacter")
    public String saveCharacter(@ModelAttribute("userCharacter") @Valid UserCharacter userCharacter,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "newUserCharacter";
        }
        userCharacterService.saveUserCharacter(userCharacter);
        return "redirect:/";
    }

}
