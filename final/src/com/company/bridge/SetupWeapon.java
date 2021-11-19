package com.company.bridge;

public class SetupWeapon implements WeaponWork {

    @Override
    public void onActivate() {
        System.out.println("The item begins to set up and work.");
    }

    @Override
    public void apply() {
        System.out.println("The item flies and strikes the enemies.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item stop to work.");
    }
}