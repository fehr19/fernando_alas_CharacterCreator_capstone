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

    @GetMapping("/showNewPlayerForm")
    public String showNewPlayerForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "newPlayer";
    }

    @GetMapping("/showUpdatePlayerForm/{id}")
    public String showUpdateCharacterForm(@PathVariable int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "updatePlayer";
    }

    @PostMapping("/savePlayer")
    public String savePlayer(@ModelAttribute("player") @Valid Player player,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "newPlayer";
        }
        playerService.savePlayer(player);
        return "redirect:/";
    }

    @GetMapping("/deletePlayer/{id}")
    public String deletePlayer(@PathVariable int id) {
        this.playerService.deletePlayerById(id);
        return "redirect:/";
    }

}
