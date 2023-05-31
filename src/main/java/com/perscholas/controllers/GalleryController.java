package com.perscholas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {
    //GetMapping to specify URL, return to specify HTML file

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        return "gallery";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}
