package com.mueble.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "almacen")
@Entity(name = "Almacen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo ;
    @Column(nullable = false)
    public String tipo;
    @Column(nullable = false)
    public String clase;
    @Column(length = 16)
    public String modelo;


}
