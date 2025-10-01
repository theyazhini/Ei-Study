package com.example.designpatterns.creational.singleton;

import java.time.LocalTime;

public class Logger {
    // static instance (only one allowed)
    private static Logger instance;

    // private constructor prevents direct creation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // synchronized to be thread-safe
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println(LocalTime.now() + " - LOG - " + msg);
    }
}
