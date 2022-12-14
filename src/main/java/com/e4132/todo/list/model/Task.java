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
@Table(name = "table_task")
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
    private String time;




    //    public enum Importance{
//        IMPORTANT, VERY_IMPORTANT, NOT_IMPORTANT
//    }

}
