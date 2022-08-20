package com.e4132.todo.list.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "table_todolist")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task")
    private String task;

    @Column(name = "importance")
    private Integer importance;

    @Column(name = "day_of_week")
    private Date dayOfWeek;

    @Column(name = "time")
    private Time time;

    public Task(String task, Integer importance, Date dayOfWeek, Time time) {
        this.task = task;
        this.importance = importance;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
    }

    //    public enum Importance{
//        IMPORTANT, VERY_IMPORTANT, NOT_IMPORTANT
//    }

}
