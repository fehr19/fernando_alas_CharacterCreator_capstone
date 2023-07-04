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

    // Player list
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

    // Change this to update player, need to pass id
    @PostMapping("/updatePlayer")
    public String savePlayer(@ModelAttribute("player") @Valid Player player,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // need to change to reload character that was being updated
            return "player/characterName";
        }
        playerService.savePlayer(player);
        return "redirect:/";
    }

    // START Character creation flow --------------------------------->

    // Step 1 Show character name form
    @GetMapping("/showNewPlayerForm")
    public String showNewPlayerForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "player/characterName";
    }

    // Step 2 save character name
    @PostMapping("/saveNewCharacter")
    public String saveNewCharacter(@ModelAttribute("player") @Valid Player player,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "player/characterName";
        }
        playerService.savePlayer(player);
        int id = player.getId();
        return "redirect:/showAbilitiesForm/" + id;
    }

    // Step 3 show Abilities form
    @GetMapping("/showAbilitiesForm/{id}")
    public String showAbilitiesForm(@PathVariable(value = "id") int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "player/abilities";
    }

    //Step 4 save abilities and show ancestry Form
    @PostMapping("/saveAbilities")
    public String saveAbilities(@ModelAttribute("player") Player player) {
        playerService.savePlayer(player);
        return "redirect:/showAncestriesForm/" + player.getId();
    }

    @GetMapping("/showAncestriesForm/{id}")
    public String showAncestryForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("listAncestries", ancestryService.getAllAncestries());
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player/ancestry";
    }

    // Step 4 calculate speed
    @GetMapping("/calculateSpeed/{speedMod}")
    public String calculateSpeed(@PathVariable(value = "speedMod") int speedMod,
                                 @ModelAttribute Player player) {
        //Calculate Speed
        int speed = ancestryService.calculateSpeed(player, speedMod);
        return "redirect:/saveAncestry/" + speed;
    }

    // Step 4 save Ancestry and show ancestry abilities form
    @GetMapping("/showAncestryBenefits")
    public String showAncestryBenefits(@ModelAttribute("player") Player player, Model model) {

        // Save ancestry
        playerService.savePlayer(player);
        return "redirect:/player/ancestryBenefit";
    }


}
