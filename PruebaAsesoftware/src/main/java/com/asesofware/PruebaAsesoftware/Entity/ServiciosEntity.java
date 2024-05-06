package com.asesofware.PruebaAsesoftware.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "servicios")
public class ServiciosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;

    private Long idComercio; // Clave foránea
    private String nombreServicio;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private Integer duracion;
}
