package com.example.designpatterns.behavioral.strategy;

public class StrategyDemo {
    public static void run() {
        PaymentContext ctx = new PaymentContext(new CreditCardStrategy("1234567812345678"));
        ctx.pay(50.0);

        ctx.setStrategy(new UPIStrategy("yazhini@upi"));
        ctx.pay(75.5);
    }
}
