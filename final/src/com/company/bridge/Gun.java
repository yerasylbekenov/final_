package com.company.bridge;

public class Gun implements Weapon {

    private final WeaponWork weaponWork;

    public Gun(WeaponWork weaponWork) {
        this.weaponWork = weaponWork;
    }

    @Override
    public void wield() {
        System.out.println("The gun is wielded.");
        weaponWork.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The gun shoots.");
        weaponWork.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The gun is unwielded.");
        weaponWork.onDeactivate();
    }

    @Override
    public WeaponWork getWeaponWork() {
        return weaponWork;
    }
}