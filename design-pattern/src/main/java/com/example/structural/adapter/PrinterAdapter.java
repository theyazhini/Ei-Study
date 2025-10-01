package com.example.designpatterns.structural.adapter;

public class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String text, int copies) {
        for (int i = 1; i <= copies; i++) {
            legacyPrinter.legacyPrint(text + " (copy " + i + ")");
        }
    }
}
