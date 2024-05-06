package com.asesofware.PruebaAsesoftware.Controller;

import com.asesofware.PruebaAsesoftware.Entity.TurnoEntity;
import com.asesofware.PruebaAsesoftware.Model.TurnoRequest;
import com.asesofware.PruebaAsesoftware.Service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    @PostMapping("/generar")
    public ResponseEntity<?> generarTurnos(@RequestBody TurnoRequest request) {
        turnoService.generarTurnos(request.getFechaInicio(), request.getFechaFin(), request.getIdServicio());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<TurnoEntity>> getAllTurnos() {
        List<TurnoEntity> turnos = turnoService.getAllTurnos();
        return ResponseEntity.ok(turnos);
    }
}
