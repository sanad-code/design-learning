package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Sorry, I can't fly");
    }
}
