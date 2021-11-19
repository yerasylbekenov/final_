package com.company.observer;

public class Commentator3 extends Observer{

    public Commentator3(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Comentator3:I think that counter-terrorists will go to save weapons");
    }
}