package com.miage.altea.tp.pokemon_ui.pokemonTypes.service;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.bo.PokemonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {


    @Autowired
    RestTemplate restTemplates;
    String pokemonServiceUrl;

    public List<PokemonType> listPokemonsTypes() {
        PokemonType[] pokemons = restTemplates.getForObject(pokemonServiceUrl+"/pokemon-types/", PokemonType[].class);
        return Arrays.asList(pokemons);
    }

    @Autowired
    void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplates = restTemplate;
    }

    @Value("${pokemonType.service.url}")
    void setPokemonTypeServiceUrl(String pokemonServiceUrl) {
        this.pokemonServiceUrl = pokemonServiceUrl;
    }
}
