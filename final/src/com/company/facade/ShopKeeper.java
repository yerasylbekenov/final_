package com.company.facade;

public class ShopKeeper {
    private SteamShop ak;
    private SteamShop deagle;
    private SteamShop awp;
    private SteamShop m4a4;

    public ShopKeeper(){
        ak = new Ak47FireSerpent();
        deagle = new DeagleFlame();
        awp = new AwpDragonLore();
        m4a4 = new M4a4Howl();
    }

    public void akSale(){
        ak.modelNo();
        ak.price();
    }

    public void deagleSale(){
        deagle.modelNo();
        deagle.price();
    }

    public void awpSale(){
        awp.modelNo();
        awp.price();
    }

    public void m4a4Sale(){
        m4a4.modelNo();
        m4a4.price();
    }
}
