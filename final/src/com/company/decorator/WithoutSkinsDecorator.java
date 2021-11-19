package com.company.decorator;

public class WithoutSkinsDecorator extends PlayerDecorator{

    public WithoutSkinsDecorator(Player decoratedPlayer){
        super(decoratedPlayer);
    }

    @Override
    public void play(){
        decoratedPlayer.play();
        setWithSkins(decoratedPlayer);
    }

    private void setWithSkins(Player decoratedPlayer){
        System.out.println("Skins: off");
    }
}
