package com.e4132.todo.list.forms;


import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class TaskForm {

    private Long id;
    private String task;
    private Integer importance;
    private Date dayOfWeek;
    private String time;
}
