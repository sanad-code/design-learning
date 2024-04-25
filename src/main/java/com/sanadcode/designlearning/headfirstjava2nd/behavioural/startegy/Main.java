package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy;

public class Main {
    public static void main(String[] args) {
        Duck wood = new WoodDuck();
        Duck real = new RealDuck();

        wood.swim();
        wood.fly();
        wood.quack();

        real.swim();
        real.fly();
        real.quack();

        wood.setFlyBehaviour(new FireFly());
        wood.fly();
    }
}
