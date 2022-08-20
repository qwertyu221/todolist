package com.e4132.todo.list.services;

import com.e4132.todo.list.model.Task;
import com.e4132.todo.list.repositories.TaskRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{

    private final TaskRepositories taskRepositories;

    @Override
    @Transactional
    public void addTask(Task task) {
        Task newTask = new Task(task.getTask(),task.getImportance(),task.getDayOfWeek(),task.getTime());
        taskRepositories.save(newTask);
    }

    @Override
    @Transactional
    public List<Task> getAllTasks() {
        return taskRepositories.findAll();
    }

    @Override
    @Transactional
    public void deleteTask(Long idTask) {
        taskRepositories.deleteById(idTask);
    }

    @Override
    @Transactional
    public Task getTask(Long taskId) {
        Optional<Task> task = taskRepositories.findById(taskId);
        return task.orElseThrow();
    }
}
