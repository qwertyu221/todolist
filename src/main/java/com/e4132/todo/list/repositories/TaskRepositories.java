package com.e4132.todo.list.repositories;


import com.e4132.todo.list.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface TaskRepositories extends JpaRepository<Task,Long> {

}
