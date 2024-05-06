package com.asesofware.PruebaAsesoftware;

import com.asesofware.PruebaAsesoftware.Service.TurnoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TurnoServiceTest {

    @Autowired
    private TurnoService turnoService;

    @Test
    public void testGenerarTurnos() {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = fechaInicio.plusDays(7);
        Long idServicio = 1L;

        boolean resultado = turnoService.generarTurnos(fechaInicio, fechaFin, idServicio);

        assertTrue(resultado);
    }
}
