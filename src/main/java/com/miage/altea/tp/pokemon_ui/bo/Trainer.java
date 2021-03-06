package com.miage.altea.tp.pokemon_ui.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Trainer {

    private String name;

    private List<Pokemon> team;

    private List<PokemonType> teamPokemon;

    private String urlIcon;

    private String password;

    public Trainer() {}

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(List<Pokemon> team) {
        this.team = team;
    }

    public String getUrlIcon() { return urlIcon; }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }

    public List<PokemonType> getTeamPokemon() {
        return teamPokemon;
    }

    public void setTeamPokemon(List<PokemonType> teamPokemon) {
        this.teamPokemon = teamPokemon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}