package com.example.designpatterns;

import java.util.Scanner;

// Import demos
import com.example.designpatterns.behavioral.observer.ObserverDemo;
import com.example.designpatterns.behavioral.strategy.StrategyDemo;
import com.example.designpatterns.creational.singleton.SingletonDemo;
import com.example.designpatterns.creational.factory.FactoryDemo;
import com.example.designpatterns.structural.adapter.AdapterDemo;
import com.example.designpatterns.structural.decorator.DecoratorDemo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose demo:");
            System.out.println("1. Observer Pattern");
            System.out.println("2. Strategy Pattern");
            System.out.println("3. Singleton Pattern");
            System.out.println("4. Factory Pattern");
            System.out.println("5. Adapter Pattern");
            System.out.println("6. Decorator Pattern");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int c = sc.nextInt();
            sc.nextLine(); // consume newline

            if (c == 0) {
                System.out.println("Exiting... Bye!");
                break;
            }

            switch (c) {
                case 1:
                    ObserverDemo.run();
                    break;
                case 2:
                    StrategyDemo.run();
                    break;
                case 3:
                    SingletonDemo.run();
                    break;
                case 4:
                    FactoryDemo.run();
                    break;
                case 5:
                    AdapterDemo.run();
                    break;
                case 6:
                    DecoratorDemo.run();
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }

        sc.close();
    }
}

