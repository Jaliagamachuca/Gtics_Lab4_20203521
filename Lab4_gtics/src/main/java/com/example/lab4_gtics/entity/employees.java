package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employees")
public class employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employee_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private int password;

    @Column(name="phone_number")
    private String phone_number;

    @Column(name="hire_date")
    private String hire_date;

    @Column(name="job_id")
    private String job_id;

    @Column(name="salary")
    private double salary;

    @Column(name="commission_pct")
    private double commission_pct;

    @Column(name="manager_id")
    private int manager_id;

    @Column(name="department_id")
    private int department_id;

    @Column(name="enabled")
    private int enabled;

}