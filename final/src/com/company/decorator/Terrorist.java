package com.company.decorator;

public class Terrorist implements Player{
    String name;

    public Terrorist(String name){ this.name = name;}
    @Override
    public void play(){
        System.out.println("T player: "+name);
    }
}
