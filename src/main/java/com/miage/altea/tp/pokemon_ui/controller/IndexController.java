package com.miage.altea.tp.pokemon_ui.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/registerTrainer")
    public ModelAndView registerNewTrainer(String trainerName) {
        HashMap<String,String> model= new HashMap<>();
        model.put("name",trainerName);
        ModelAndView mandv = new ModelAndView("register",model);
        return mandv;
    }


}
