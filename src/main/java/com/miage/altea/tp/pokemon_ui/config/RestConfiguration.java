package com.miage.altea.tp.pokemon_ui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestConfiguration {

    @Bean("pokemonTypeRestTemplate")
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Value("${trainer.service.username}")
    private String username;

    @Value("${trainer.service.password}")
    private String password;

    @Bean("trainerRestTemplate")
    RestTemplate trainerApiRestTemplate(){
        BasicAuthenticationInterceptor bai = new BasicAuthenticationInterceptor(username,password);
        RestTemplate tmpl = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(bai);
        tmpl.setInterceptors(interceptors);

        return tmpl;
    }

}