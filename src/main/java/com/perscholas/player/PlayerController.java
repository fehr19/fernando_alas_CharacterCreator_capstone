package com.perscholas.player;

import com.perscholas.ancestry.AncestryService;
import com.perscholas.ancestryBenefit.AncestryBenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PlayerController {

    private final PlayerService playerService;
    private final AncestryService ancestryService;
    private final AncestryBenefitService ancestryBenefitService;

    @Autowired
    public PlayerController(PlayerService playerService, AncestryService ancestryService, AncestryBenefitService ancestryBenefitService) {
        this.playerService = playerService;
        this.ancestryService = ancestryService;
        this.ancestryBenefitService = ancestryBenefitService;
    }

    @GetMapping("/")
    public String getAllPlayers(Model model) {
        model.addAttribute("listPlayers", playerService.getAllPlayers());
        return "home";
    }



    @GetMapping("/showUpdatePlayerForm/{id}")
    public String showUpdateCharacterForm(@PathVariable int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "updatePlayer";
    }

    @GetMapping("/deletePlayer/{id}")
    public String deletePlayer(@PathVariable int id) {
        this.playerService.deletePlayerById(id);
        return "redirect:/";
    }

    @PostMapping("/savePlayer")
    public String savePlayer(@ModelAttribute("player") @Valid Player player,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "player/characterName";
        }
        playerService.savePlayer(player);
        // Can this return "player/{id}/abilities?
        return "home";
    }

    // START Character creation flow

    // Step 1 Show character name form
    @GetMapping("/showNewPlayerForm")
    public String showNewPlayerForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "player/characterName";
    }


    // Step 2 save player and show abilities form
    @GetMapping("/showAbilitiesForm")
    public String showAbilitiesForm(@ModelAttribute("player") Player player) {
        playerService.savePlayer(player);
        return "player/abilities";
    }

    //Step 3 save abilities and show ancestry Form
    @GetMapping("/showAncestryForm")
    public String showAncestryForm(@ModelAttribute("player") Player player, Model model) {
        playerService.savePlayer(player);
        model.addAttribute("listAncestries", ancestryService.getAllAncestries());
        return "player/ancestry";
    }

    // Step 4 save Ancestry and show ancestry abilities form
    @PostMapping("/showAncestryBenefitForm")
    public String showAncestryBenefitForm(@ModelAttribute("player") Player player, Model model) {
        playerService.savePlayer(player);
        model.addAttribute("listAncestryBenefits", ancestryBenefitService.getAllAncestryBenefits());
        return "player/ancestryBenefit";
    }


}
