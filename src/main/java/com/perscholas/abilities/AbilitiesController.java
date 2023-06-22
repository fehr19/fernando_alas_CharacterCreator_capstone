package com.perscholas.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AbilitiesController {

    private AbilitiesService abilitiesService;

    public AbilitiesController() {
    }

    @Autowired
    public AbilitiesController(AbilitiesService abilitiesService) {
        this.abilitiesService = abilitiesService;
    }


}
