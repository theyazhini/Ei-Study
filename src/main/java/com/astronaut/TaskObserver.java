package com.astronaut;

public interface TaskObserver {
    void notifyConflict(Task existingTask, Task newTask);
}
