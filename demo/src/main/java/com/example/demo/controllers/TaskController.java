package com.example.demo.controllers;

import com.example.demo.models.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @GetMapping
    public List<Task> getTasks(){
        return taskRepository.getTasks();
    }
    @PostMapping
    public void addTask(@RequestBody Task task){
        taskRepository.addTask(task);
    }
    @DeleteMapping
    public void deleteTask(@RequestParam int taskId){
        taskRepository.deleteTask(taskId);
    }
    @PutMapping
    public void editTask(@RequestParam int taskId,@RequestBody Task task){
        taskRepository.editTask(taskId,task);
    }
}
