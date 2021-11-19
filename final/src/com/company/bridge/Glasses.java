package com.company.bridge;

public class Glasses implements Weapon {

    private final WeaponWork weaponWork;

    public Glasses(WeaponWork weaponWork) {
        this.weaponWork = weaponWork;
    }

    @Override
    public void wield() {
        System.out.println("The Glasses are wielded.");
        weaponWork.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The Glasses are on.");
        weaponWork.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The Glasses are unwielded.");
        weaponWork.onDeactivate();
    }

    @Override
    public WeaponWork getWeaponWork() {
        return weaponWork;
    }
}