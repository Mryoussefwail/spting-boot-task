package com.example.demo.repositories;

import com.example.demo.RowMapper.TasksRowMapper;
import com.example.demo.models.Task;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {
    private JdbcTemplate jdbc;

    public TaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public void addTask(Task task){
        String sql="insert into task values (NULL,?,?,?,?,?)";
        jdbc.update(sql,task.getTaskName(),task.getDescription(),task.getDate(),task.getTime(),"offline");
    }
    public void deleteTask(int taskId){
        String sql="delete from task where taskId = ?";
        jdbc.update(sql,taskId);
    }
    public List<Task> getTasks(){
        String sql="select * from task;";
        return jdbc.query(sql,new TasksRowMapper());
    }
    public void editTask(int taskId,Task task){
        String sql="update task set taskName = ? ,description = ? , date = ?, time = ? status = ?";
        jdbc.update(sql,task.getTaskName(),task.getDescription(),task.getDate(),task.getTime(),"offline");
    }
}
