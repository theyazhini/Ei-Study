package com.example.designpatterns.behavioral.observer;

public interface StockObserver {
    void update(Stock stock);
    String getName();
}
