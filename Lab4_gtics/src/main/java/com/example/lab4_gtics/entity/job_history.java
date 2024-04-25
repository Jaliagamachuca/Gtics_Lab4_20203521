package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="job_history")
public class job_history {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private String job_id;

    @Column(name="job_title")
    private String job_title;

    @Column(name="min_salary")
    private int min_salary;

    @Column(name="max_salary")
    private int max_salary;

}