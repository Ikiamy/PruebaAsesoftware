package com.asesofware.PruebaAsesoftware.Service;

import com.asesofware.PruebaAsesoftware.Entity.TurnoEntity;
import com.asesofware.PruebaAsesoftware.Repository.TurnoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class TurnoService {

    private static final Logger logger = LoggerFactory.getLogger(TurnoService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TurnoRepository turnoRepository;

    public boolean generarTurnos(LocalDate fechaInicio, LocalDate fechaFin, Long idServicio) {
        try {
            jdbcTemplate.execute("CALL GenerarTurnos(?, ?, ?)",
                    (CallableStatementCallback<Boolean>) cs -> {
                        cs.setDate(1, Date.valueOf(fechaInicio));
                        cs.setDate(2, Date.valueOf(fechaFin));
                        cs.setLong(3, idServicio);
                        return cs.execute();
                    });
        } catch (Exception e) {
            // Manejo de excepciones
            logger.error("Ocurrio un Error al generar turnos "+ e.getMessage());
            return false;
        }
        return false;
    }

    public List<TurnoEntity> getAllTurnos() {
        return turnoRepository.findAll();
    }
}
