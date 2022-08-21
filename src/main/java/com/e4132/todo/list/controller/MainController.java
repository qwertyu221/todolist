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

    @GetMapping("/todo/imp")
    public String getToDoListByImportance(Model model){
        List<Task> tasks = taskService.getAllTasksByImportance();
        model.addAttribute("allTasks", tasks);
        return "allTasks";
    }

    @GetMapping("/todo/date")
    public String getToDoListByDate(Model model){
        List<Task> tasks = taskService.getAllTasksByDay();
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
        taskService.addTask(form);
        return "redirect:/todo";
    }

    @PostMapping("/todo/{task-Id}/delete")
    public String deleteTask(@PathVariable("task-Id") Long id){
        taskService.deleteTask(id);
        return "redirect:/todo";
    }

    @GetMapping("/todo/{task-Id}")
    public String getUserPage(@PathVariable("task-Id") Long id, Model model){
        Task task = taskService.getTask(id);
        model.addAttribute("task",task);
        return "changeTask";
    }
    @PostMapping("/todo/{task-Id}/update")
    public String updateTask(@PathVariable("task-Id") Long id, TaskForm form){
        form.setId(id);
        taskService.addTask(form);
        return "redirect:/todo";
    }
}
