package com.example.demo.models;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private int taskId;

    private String taskName;
    private String description;

    private Date date;
    private Time time;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(int taskId, String taskName, String description, Date date, java.sql.Time time) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.date = date;
        this.time = time;
    }
    public Task(){
        this.taskId = 0;
        this.taskName = "taskName";
        this.description = "description";
        this.date =  Date.valueOf(LocalDate.now());
        this.time = java.sql.Time.valueOf(LocalTime.now());
        this.status="";
    }

    public int gettaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(java.sql.Time time) {
        this.time = time;
    }
}
