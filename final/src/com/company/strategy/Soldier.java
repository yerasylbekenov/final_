package com.company.strategy;

public abstract class Soldier {
    private Bomb bomb;
    private Hostages hostages;
    private GunBehavior gunBehavior;

    public Soldier(Bomb bomb, Hostages hostages, GunBehavior gunBehavior) {
        this.bomb = bomb;
        this.hostages = hostages;
        this.gunBehavior = gunBehavior;
    }

    public void useGun(){
        gunBehavior.useGun();
    }

    public void useHostages(){
        hostages.hostages();
    }

    public void useBomb(){
        bomb.bomb();
    }

    public abstract void gunfire();

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    public void setHostages(Hostages hostages) {
        this.hostages = hostages;
    }

    public void setGunBehavior(GunBehavior gunBehavior) {
        this.gunBehavior = gunBehavior;
    }
}
