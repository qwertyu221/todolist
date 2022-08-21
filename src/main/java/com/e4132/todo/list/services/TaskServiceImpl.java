package com.e4132.todo.list.services;

import com.e4132.todo.list.forms.TaskForm;
import com.e4132.todo.list.model.Task;
import com.e4132.todo.list.repositories.TaskRepositories;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.Collections;
import java.util.List;


@Component
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{

    private final TaskRepositories taskRepositories;

    @Override
    @Transactional
    public void addTask(TaskForm task) {

        Task newTask = new Task();
        if (task.getId() != null){
            newTask.setId(task.getId());
        }
        newTask.setTask(task.getTask());
        newTask.setImportance(task.getImportance());
        newTask.setDayOfWeek(task.getDayOfWeek());
        newTask.setTime(task.getTime());
        taskRepositories.save(newTask);
    }

    @Override
    @Transactional
    public List<Task> getAllTasks() {
        return taskRepositories.findAll();
    }


    @Override
    @Transactional
    public List<Task> getAllTasksByImportance() {
        List<Task> task = taskRepositories.findAll(Sort.by("importance"));
        Collections.reverse(task);
        return task;
    }

    @Override
    public List<Task> getAllTasksByDay() {
        return taskRepositories.findAll(Sort.by("dayOfWeek"));
    }
    @Override
    @Transactional
    public void deleteTask(Long idTask) {
        taskRepositories.deleteById(idTask);
    }

    @Override
    @Transactional
    public Task getTask(Long taskId) {
        return taskRepositories.getReferenceById(taskId);
    }

//    @Override
//    @Transactional
//    public Task save(Long taskId) {
//        return taskRepositories.getReferenceById(taskId);
//    }
//
//
//    Customer c = new Customer();
//    c.name = name;
//        repo.save(c);
}
