package com.company.strategy;

public class Defusing implements Bomb{
    @Override
    public void bomb() {
        System.out.println("I am defusing the bomb!");
    }
}
