package com.example.designpatterns.behavioral.strategy;

public class UPIStrategy implements PaymentStrategy {
    private final String vpa;

    public UPIStrategy(String vpa) {
        this.vpa = vpa;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI id " + vpa);
    }
}
