package com.company.decorator;

public class CounterTerrorist implements Player{
    String name;

    public CounterTerrorist(String name){ this.name = name;}
    @Override
    public void play(){
        System.out.println("CT player: "+name);
    }
}
