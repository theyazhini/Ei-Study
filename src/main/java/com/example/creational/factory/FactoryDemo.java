package com.example.designpatterns.creational.factory;

import java.util.Scanner;

public class FactoryDemo {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape (circle/square): ");
        String input = sc.nextLine();

        try {
            Shape shape = ShapeFactory.createShape(input);
            shape.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
