package com.astronaut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager manager = ScheduleManager.getInstance();

        System.out.println("=== Astronaut Daily Schedule Organizer ===");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine().trim();

                    System.out.print("Enter start time (HH:mm): ");
                    String start = scanner.nextLine().trim();

                    System.out.print("Enter end time (HH:mm): ");
                    String end = scanner.nextLine().trim();

                    System.out.print("Enter priority (High/Medium/Low): ");
                    String priority = scanner.nextLine().trim();

                    try {
                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        boolean added = manager.addTask(task);
                        if (added) {
                            System.out.println("Task added successfully. No conflicts.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Enter task description to remove: ");
                    String removeDesc = scanner.nextLine().trim();
                    boolean removed = manager.removeTask(removeDesc);
                    if (removed) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Error: Task not found.");
                    }
                    break;

                case "3":
                    manager.viewTasks();
                    break;

                case "4":
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
