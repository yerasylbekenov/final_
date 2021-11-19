package com.company.strategy;

public class Terror extends Soldier{
    public Terror() {
        super(new Plant(), new TakeHostages(), new AK());
    }

    @Override
    public void gunfire() {
        System.out.println("I am TERRORIST!");
    }
}
