package com.perscholas.controllers;

import com.perscholas.models.Player;
import com.perscholas.services.PlayerService;
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
public class PlayerController {

    private PlayerService playerService;

    public PlayerController() {

    }

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/")
    public String getAllPlayers(Model model) {
        model.addAttribute("listPlayers", playerService.getAllPlayers());
        return "home";
    }

    @GetMapping("/showNewCharacterForm")
    public String showNewCharacterForm(Model model) {
        Player Player = new Player();
        model.addAttribute("userCharacter", Player);
        return "newUserCharacter";
    }

    @GetMapping("/showUpdateCharacterForm/{characterId}")
    public String showUpdateCharacterForm(@PathVariable int userCharacterId, Model model) {
        Player Player = playerService.getPlayerById(userCharacterId);
        model.addAttribute("userCharacter", Player);
        return "updateCharacter";
    }

    @PostMapping("/saveCharacter")
    public String saveCharacter(@ModelAttribute("userCharacter") @Valid Player Player,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "newUserCharacter";
        }
        playerService.savePlayer(Player);
        return "redirect:/";
    }

}
