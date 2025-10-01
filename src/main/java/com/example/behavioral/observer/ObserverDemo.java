package com.example.designpatterns.behavioral.observer;

public class ObserverDemo {
    public static void run() {
        Stock google = new Stock("GOOG", 100.0);

        Investor a = new Investor("Investor A");
        Investor b = new Investor("Investor B");

        google.attach(a);
        google.attach(b);

        google.setPrice(120.0);
        google.setPrice(150.0);

        google.detach(b);
        google.setPrice(170.0);
    }
}
