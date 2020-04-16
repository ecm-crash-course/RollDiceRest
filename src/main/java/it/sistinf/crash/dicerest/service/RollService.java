package it.sistinf.crash.dicerest.service;

import java.util.Random;

public class RollService {

    public int rollOne(int min, int max){
        Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }

}