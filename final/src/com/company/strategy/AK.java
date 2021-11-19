package com.company.strategy;

public class AK implements GunBehavior{
    @Override
    public void useGun() {
        System.out.println("I am using AK-47!");
    }
}
