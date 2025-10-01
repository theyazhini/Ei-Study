package com.example.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Base Coffee";
    }

    @Override
    public double cost() {
        return 2.0; // base cost
    }
}
