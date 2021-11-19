package com.company.facade;

public class Ak47FireSerpent implements SteamShop{
    @Override
    public void modelNo(){
        System.out.println("Ak-47 Fire Serpent");
    }
    @Override
    public void price(){
        System.out.println("600$");
    }
}
