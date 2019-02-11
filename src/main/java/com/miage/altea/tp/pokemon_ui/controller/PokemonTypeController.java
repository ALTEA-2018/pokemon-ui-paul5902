package com.miage.altea.tp.pokemon_ui.controller;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.bo.PokemonType;
import com.miage.altea.tp.pokemon_ui.pokemonTypes.service.PokemonTypeService;
import com.miage.altea.tp.pokemon_ui.pokemonTypes.service.PokemonTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class PokemonTypeController {

    @Autowired
    PokemonTypeService pokemonTypeService;

    @GetMapping("/pokedex")
    public ModelAndView pokedex(){
        List<PokemonType> pokemonTypes = pokemonTypeService.listPokemonsTypes();
        HashMap<String, List<PokemonType>> model= new HashMap<>();
        model.put("pokemonTypes",pokemonTypes);
        ModelAndView mandv = new ModelAndView("pokedex",model);
        return mandv;
    }

    public void setPokemonTypeService(PokemonTypeService pokemonTypeService) {
        this.pokemonTypeService = pokemonTypeService;
    }

}

