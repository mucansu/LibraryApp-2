package com.example.demo.Controller;


import com.example.demo.Entities.Profile;
import com.example.demo.Repository.ProfileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    private ProfileRepository profileRepository;
    @GetMapping("/")
    public String home(Model model){
      //  Iterable<Profile> profiles = profileRepository.findAll();
        model.addAttribute("profile", new Profile());
    //    model.addAttribute("profiles",profiles);
        return "home";
    }
    @PostMapping("/")
    public String home(Model model, @ModelAttribute Profile profile){
        model.addAttribute("profile", profile);
        return "home";
    }
}
