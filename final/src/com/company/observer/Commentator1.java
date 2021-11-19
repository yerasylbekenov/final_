package com.company.observer;

public class Commentator1 extends Observer{

    public Commentator1(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Comemtator1:I think the bomb will explode after all");
    }
}