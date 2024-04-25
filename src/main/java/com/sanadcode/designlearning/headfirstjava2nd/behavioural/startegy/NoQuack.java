package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public class NoQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
