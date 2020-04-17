package it.sistinf.crash.dicerest.service;

import java.util.Random;

public class RollService {

    private Random r = new Random();

    public int rollOne(int min, int max){
		return r.nextInt((max - min) + 1) + min;
    }

    /*
     * AGGIUNGERE UN METODO PER IL LANCIO DOPPIO DEI DADI
     * CHE RESTITUISCA UNA LISTA DI RISULTATI
     */
    

}