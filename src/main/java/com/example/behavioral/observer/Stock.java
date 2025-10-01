package com.example.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private double price;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void attach(StockObserver observer) {
        observers.add(observer);
        System.out.println(observer.getName() + " subscribed.");
    }

    public void detach(StockObserver observer) {
        observers.remove(observer);
        System.out.println(observer.getName() + " unsubscribed.");
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Stock price set to " + price);
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }

    public double getPrice() {
        return price;
    }
}
