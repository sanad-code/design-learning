package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public abstract class Duck {
    String name;
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}
