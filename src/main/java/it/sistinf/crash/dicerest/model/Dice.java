package it.sistinf.crash.dicerest.model;

public class Dice {

    private int value;

    private Dice(){};
    public Dice(int _value){
        this.value = _value;
    }; 

    public int getValue(){
        return this.value;
    }


}