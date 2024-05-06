package com.asesofware.PruebaAsesoftware.Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TurnoRequest {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Long idServicio;

}
