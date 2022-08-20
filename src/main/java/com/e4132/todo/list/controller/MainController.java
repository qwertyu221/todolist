package com.e4132.todo.list.controller;

import com.e4132.todo.list.forms.TaskForm;
import com.e4132.todo.list.model.Task;
import com.e4132.todo.list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    private final TaskService taskService;

    @Autowired
    public MainController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/todo")
    public String getToDoList(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("allTasks", tasks);
        return "allTasks";
    }

    @GetMapping("todo/addTask")
    public String addTask(Model model){
        Task task = new Task();
        model.addAttribute("task",task);
        return "addTask";
    }

    @PostMapping("/todo/saveTask")
    public String addTaskToList(TaskForm form){
        Task task = new Task();
        task.setTask(form.getTask());
        task.setImportance(form.getImportance());
        task.setDayOfWeek(form.getDayOfWeek());
        task.setTime(form.getTime());
        taskService.addTask(task);
        return "redirect:/todo";
    }

    @PostMapping("/todo/{task-Id}/delete")
    public String deleteTask(@PathVariable("task-Id") Long id){
        taskService.deleteTask(id);
        return "redirect:/todo";
    }
}
