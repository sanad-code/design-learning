package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public class WoodDuck extends Duck{
    WoodDuck(){
        this.flyBehaviour = new NoFly();
        this.quackBehaviour = new NoQuack();
    }
}
