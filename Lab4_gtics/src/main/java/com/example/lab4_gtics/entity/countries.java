package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="countries")
public class countries{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id")
    private int country_id;
    @Column(name="country_name")
    private String country_name;
    @Column(name="region_id")
    private int region_id;


}
