package com.example.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void run() {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting system...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Still running...");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
