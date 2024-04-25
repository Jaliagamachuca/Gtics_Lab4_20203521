package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="locations")
public class locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="location_id")
    private int location_id;

    @Column(name="street_address")
    private String street_address;

    @Column(name="postal_code")
    private String postal_code;

    @Column(name="city")
    private String city;

    @Column(name="state_province")
    private String state_province;

    @Column(name="country_id")
    private String country_id;



}
