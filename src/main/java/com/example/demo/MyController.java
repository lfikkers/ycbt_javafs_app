package com.example.demo;

import com.example.demo.model.Pet;
import com.example.demo.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private IPetService petService;

    @GetMapping("/showPets")
    public String findPets(Model model) {
        List<Pet> pets = (List<Pet>) petService.findAll();
        model.addAttribute("pets", pets);
        return "showPets";
    }
}
