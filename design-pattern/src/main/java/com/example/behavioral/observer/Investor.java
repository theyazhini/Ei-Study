package com.example.designpatterns.behavioral.observer;

public class Investor implements StockObserver {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println(name + " notified: Stock price updated to " + stock.getPrice());
    }

    @Override
    public String getName() {
        return name;
    }
}
