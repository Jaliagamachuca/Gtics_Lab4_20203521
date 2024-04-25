package com.example.lab4_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="regions")
public class regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_medicamentos")
    private int id;
    @Column(nullable = false)
    private String descripcion;
    private String nombre;
    private int inventario;
    private double precio_unidad;
    private String fecha_ingreso;
}
