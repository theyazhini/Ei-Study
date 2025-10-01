package com.example.designpatterns.structural.adapter;

public class AdapterDemo {
    public static void run() {
        LegacyPrinter legacy = new LegacyPrinter();
        Printer adapter = new PrinterAdapter(legacy);

        adapter.print("Hello Adapter", 2);
    }
}

