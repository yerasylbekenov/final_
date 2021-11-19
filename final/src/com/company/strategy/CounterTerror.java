package com.company.strategy;

public class CounterTerror extends Soldier{
    public CounterTerror() {
        super(new Defusing(), new Rescue(), new M4());
    }


    @Override
    public void gunfire() {
        System.out.println("I am COUNTER TERRORIST!");
    }
}

