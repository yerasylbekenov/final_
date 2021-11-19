package com.company.observer;

public class Commentator2 extends Observer{

    public Commentator2(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Comemtator2:I think that the bomb will be cleared in time and the counter-terrorists will win" );
    }
}