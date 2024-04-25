package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="departments")
public class departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private int department_id;

    @Column(name="department_name")
    private String department_name;

    @Column(name="manager_id")
    private int manager_id;

    @Column(name="location_id")
    private int location_id;

}
