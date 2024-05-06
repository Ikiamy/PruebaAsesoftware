package com.asesofware.PruebaAsesoftware.Controller;

import com.asesofware.PruebaAsesoftware.Entity.ServiciosEntity;
import com.asesofware.PruebaAsesoftware.Service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {
    @Autowired
    private ServicioService servicioService;

    @GetMapping("/{id}")
    public ResponseEntity<ServiciosEntity> getServicioById(@PathVariable Long id) {
        Optional<ServiciosEntity> servicio = servicioService.getServicioById(id);
        return servicio.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
