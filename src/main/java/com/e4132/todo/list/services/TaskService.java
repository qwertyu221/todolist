package com.e4132.todo.list.services;



import com.e4132.todo.list.forms.TaskForm;
import com.e4132.todo.list.model.Task;

import java.util.List;

public interface TaskService {

    void addTask(TaskForm task);
    List<Task> getAllTasks();
    List<Task> getAllTasksByImportance();
    List<Task> getAllTasksByDay();
    void deleteTask(Long idTask);
    Task getTask(Long taskId);


}
