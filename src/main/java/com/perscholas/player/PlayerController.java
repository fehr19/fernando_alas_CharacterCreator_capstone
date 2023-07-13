package com.perscholas.player;

import com.perscholas.ancestry.AncestryService;
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

    @Autowired
    public PlayerController(PlayerService playerService, AncestryService ancestryService) {
        this.playerService = playerService;
        this.ancestryService = ancestryService;
    }

    // Display Player list
    @GetMapping("/")
    public String getAllPlayers(Model model) {
        model.addAttribute("listPlayers", playerService.getAllPlayers());
        return "home";
    }


    // Update player, will change later to run through the steps
    @GetMapping("/showUpdatePlayerForm/{id}")
    public String showUpdateCharacterForm(@PathVariable int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "player/characterName";
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

    // --------------------------START Character creation flow --------------------------------->

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
        return "redirect:/showAbilitiesForm/" + player.getId();
    }

    // Step 3 show Abilities form
    @GetMapping("/showAbilitiesForm/{id}")
    public String showAbilitiesForm(@PathVariable(value = "id") int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "player/abilities";
    }

    //Step 4 save abilities and redirect to ancestry Form handler
    @PostMapping("/saveAbilities")
    public String saveAbilities(@ModelAttribute("player") Player player) {
        playerService.savePlayer(player);
        return "redirect:/showAncestriesForm/" + player.getId();
    }

    // Step 5 Show Ancestry options
    @GetMapping("/showAncestriesForm/{id}")
    public String showAncestryForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("listAncestries", ancestryService.getAllAncestries());
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player/ancestry";
    }

    /* Need to write a Rest Controller to retrieve speed from ancestry and then return the
    * speed to calculate speed mod with player dexterity? Maybe create an ancestry controller
    * to handle the request and then return to the player controller? */


    // TODO Step 6 Save Ancestry how to set from the accordion?
    @PostMapping("/saveAncestry/{ancestryId}")
    public String saveAncestry(@PathVariable(value = "ancestryId") int ancestryId,
            @ModelAttribute("player") Player player,
                               Model model) {
        playerService.savePlayerAncestryByAncestryId(player, ancestryId);
        playerService.savePlayer(player);
        // TODO add model attribute for classProfession get all professions
        // model.addAttribute("listClassProfessions", classProfessionService.getAllClassProfessions());

        model.addAttribute("player", player);
        return "redirect:/showAncestryBenefits/" + player.getId();
    }



    /*Still need to do:
    * - TODO choose background and social class
    * - TODO choose class
    * - TODO calculate defense, speed and health*/
}
