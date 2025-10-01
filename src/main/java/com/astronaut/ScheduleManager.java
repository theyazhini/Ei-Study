package com.astronaut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (isOverlap(t, task)) {
                for (TaskObserver o : observers) {
                    o.notifyConflict(t, task);
                }
                System.out.println("Error: Task conflicts with existing task \"" + t.getDescription() + "\".");
                return false;
            }
        }
        tasks.add(task);
        return true;
    }

    public boolean removeTask(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasks.remove(t);
                return true;
            }
        }
        return false;
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }

        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    private boolean isOverlap(Task t1, Task t2) {
        return t1.getStartTime().before(t2.getEndTime()) && t2.getStartTime().before(t1.getEndTime());
    }
}
