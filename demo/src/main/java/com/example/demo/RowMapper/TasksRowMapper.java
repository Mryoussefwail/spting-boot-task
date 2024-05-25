package com.example.demo.RowMapper;

import com.example.demo.models.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TasksRowMapper implements RowMapper {
    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task=new Task();
        task.setTaskId(rs.getInt("taskID"));
        task.setTaskName(rs.getString("taskName"));
        task.setDescription(rs.getString("description"));
        task.setDate(rs.getDate("date"));
        task.setTime(rs.getTime("time"));
        task.setStatus(rs.getString("status"));
        return task;
    }
}
