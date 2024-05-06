package com.asesofware.PruebaAsesoftware.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comercios")
public class ComercioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComercio;

    private String nombreComercio;
    private Integer aforoMaximo;
}
