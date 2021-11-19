package com.company.bridge;

public class XrayVision implements WeaponWork {

    @Override
    public void onActivate() {
        System.out.println("The item sets up to see through walls.");
    }

    @Override
    public void apply() {
        System.out.println("The item allows you to see through walls.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item stop to work.");
    }
}