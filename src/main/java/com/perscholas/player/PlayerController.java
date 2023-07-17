package com.perscholas.player;

import com.perscholas.ancestry.AncestryService;
import com.perscholas.archetype.ArchetypeService;
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
    private final ArchetypeService archetypeService;

    @Autowired
    public PlayerController(PlayerService playerService, AncestryService ancestryService, ArchetypeService archetypeService) {
        this.playerService = playerService;
        this.ancestryService = ancestryService;
        this.archetypeService = archetypeService;
    }

    // Display Player list
    @GetMapping("/")
    public String getAllPlayers(Model model) {
        model.addAttribute("listPlayers", playerService.getAllPlayers());
        return "home";
    }

    // To show the player summary
    @GetMapping("/showViewPlayerForm/{id}")
    public String showViewPlayerForm(@PathVariable int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return"player/viewPlayer";
    }

    // Update existing player
    @GetMapping("/showUpdatePlayerForm/{id}")
    public String showUpdateCharacterForm(@PathVariable int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "player/name";
    }

    // To delete a player
    @GetMapping("/deletePlayer/{id}")
    public String deletePlayer(@PathVariable int id) {
        this.playerService.deletePlayerById(id);
        return "redirect:/";
    }


    // --------------------------START Character creation flow --------------------------------->

    // Step 1 Show character name form
    @GetMapping("/showNewPlayerForm")
    public String showNewPlayerForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "player/name";
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

    // Step 4 save abilities and redirect to ancestry Form handler
    @PostMapping("/saveAbilities")
    public String saveAbilities(@ModelAttribute("player") Player player) {
        int defense = player.getDexterity() + 10;
        player.setDefense(defense);
        playerService.savePlayer(player);
        return "redirect:/showAncestriesForm/" + player.getId();
    }

    // Step 5 Show Ancestry options from DB
    @GetMapping("/showAncestriesForm/{id}")
    public String showAncestryForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("listAncestries", ancestryService.getAllAncestries());
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player/ancestry";
    }


    // Step 6 Save Ancestry to player
    @PostMapping("/saveAncestry/{ancestryId}")
    public String saveAncestry(@PathVariable(value = "ancestryId") int ancestryId,
            @ModelAttribute("player") Player player,
                               Model model) {
        playerService.savePlayerAncestryByAncestryId(player, ancestryId);
        playerService.savePlayer(player);
        return "redirect:/showArchetypesForm/" + player.getId();
    }

    // Step 7 Show Archetype options from DB
    @GetMapping("/showArchetypesForm/{id}")
    public String showArchetypesForm(@PathVariable(value="id") int id, Model model) {
        model.addAttribute("listArchetypes", archetypeService.getAllArchetypes());
        model.addAttribute("player", playerService.getPlayerById(id));
        return "player/archetype";
    }

    // Step 8 Save Archetype and redirect to the player summary page
    @PostMapping("/saveArchetype/{archetypeId}")
    public String saveArchetype(@PathVariable(value = "archetypeId") int archetypeId,
                               @ModelAttribute("player") Player player,
                               Model model) {
        playerService.savePlayerArchetypeByArchetypeId(player, archetypeId);
        playerService.savePlayer(player);
        return "redirect:/showViewPlayerForm/" + player.getId();
    }


}
