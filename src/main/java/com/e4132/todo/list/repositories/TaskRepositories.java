package com.e4132.todo.list.repositories;


import com.e4132.todo.list.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositories extends JpaRepository<Task,Long> {

}
