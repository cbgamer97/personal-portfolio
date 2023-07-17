package com.portfolio.personalportfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        String email = "connor.f.brinkley@gmail.com";
        model.addAttribute("email", email);
        return "contact";
    }

    @GetMapping("/projects")
    public String projects(){
        return "projects";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
