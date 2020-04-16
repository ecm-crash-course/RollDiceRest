package it.sistinf.crash.dicerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sistinf.crash.dicerest.model.Dice;
import it.sistinf.crash.dicerest.service.RollService;

@RestController
@RequestMapping("/dice")
public class RollController {

    @GetMapping(value = "/one")
    public Dice rollOne(){
        
        RollService rollService = new RollService();
        int value = rollService.rollOne(1,6);

        return new Dice(value);
    
    }

    /* 
    * AGGIUNGERE UN MAPPING DI TIPO GET PER LANCIARE IL DADO DUE VOLTE
    * CHE ABBIA COME ENDPOINT "/TWO" E MODIFICARE LA RESPONSE PER STAMPARE
    * I DUE RISULTATI OTTENUTI, AD ES: { "ROLL": "1", "VALUE": 3}
    */

}