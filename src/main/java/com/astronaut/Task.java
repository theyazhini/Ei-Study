package com.astronaut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String description;
    private Date startTime;
    private Date endTime;
    private String priority;

    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm");

    public Task(String description, String start, String end, String priority) {
        this.description = description;
        this.priority = priority;

        try {
            this.startTime = TIME_FORMAT.parse(start);
            this.endTime = TIME_FORMAT.parse(end);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid time format.");
        }

        if (startTime.after(endTime)) {
            throw new IllegalArgumentException("Start time cannot be after end time.");
        }
    }

    public String getDescription() { return description; }
    public Date getStartTime() { return startTime; }
    public Date getEndTime() { return endTime; }
    public String getPriority() { return priority; }

    @Override
    public String toString() {
        return TIME_FORMAT.format(startTime) + " - " + TIME_FORMAT.format(endTime) + ": " + description + " [" + priority + "]";
    }
}
