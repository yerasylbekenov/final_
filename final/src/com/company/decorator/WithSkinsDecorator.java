package com.company.decorator;

public class WithSkinsDecorator extends PlayerDecorator{

    public WithSkinsDecorator(Player decoratedPlayer){
        super(decoratedPlayer);
    }

    @Override
    public void play(){
        decoratedPlayer.play();
        setWithSkins(decoratedPlayer);
    }

    private void setWithSkins(Player decoratedPlayer){
        System.out.println("Skins: on");
    }
}
