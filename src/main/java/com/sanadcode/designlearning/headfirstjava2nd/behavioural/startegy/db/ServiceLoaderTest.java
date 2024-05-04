package com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy.db;

import com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy.NoQuack;
import com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy.QuackBehaviour;
import com.sanadcode.designlearning.headfirstjava2nd.behavioural.startegy.Squiz;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class ServiceLoaderTest {
    public static void main(String[] args) {
//        QuackBehaviour squiz = new Squiz();
//        QuackBehaviour noQuack = new NoQuack();
//        List<QuackBehaviour> quackBehaviourList = new ArrayList<>();
//        ServiceLoader<QuackBehaviour> serviceLoader = ServiceLoader.load(QuackBehaviour.class);
//        for(QuackBehaviour quackBehaviour : serviceLoader){
//            quackBehaviourList.add(quackBehaviour);
//        }
//        System.out.println(quackBehaviourList.toString());
        // Get the service loader for the Payment interface
        ServiceLoader<Payment> loader = ServiceLoader.load(Payment.class);

        // Iterate through available Payment implementations
        for (Payment payment : loader) {
            System.out.println("Payment method: " + payment.getClass().getSimpleName());
            payment.pay(100.0); // Call the pay method on each implementation
        }
    }

    // Interface for payment methods
    interface Payment {
        void pay(double amount);
    }

    // Concrete implementation: Credit card payment
    class CreditCardPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paying $" + amount + " using credit card.");
        }
    }

    // Concrete implementation: Paypal payment
    class PaypalPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paying $" + amount + " using Paypal.");
        }
    }
}
