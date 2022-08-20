package com.e4132.todo.list.services;



import com.e4132.todo.list.model.Task;

import java.util.List;

public interface TaskService {

    void addTask(Task task);
    List<Task> getAllTasks();
    void deleteTask(Long idTask);
    Task getTask(Long taskId);

}
