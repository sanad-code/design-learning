package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public class RealDuck extends Duck{
    RealDuck(){
        this.flyBehaviour = new FireFly();
        this.quackBehaviour = new Squiz();
    }
}
