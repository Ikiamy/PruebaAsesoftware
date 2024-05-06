package com.asesofware.PruebaAsesoftware.Controller;

import com.asesofware.PruebaAsesoftware.Entity.ComercioEntity;
import com.asesofware.PruebaAsesoftware.Service.ComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comercios")
public class ComercioController {

    @Autowired
    private ComercioService comercioService;

    @GetMapping("/{id}")
    public ResponseEntity<ComercioEntity> getComercioById(@PathVariable Long id) {
        Optional<ComercioEntity> comercio = comercioService.getComercioById(id);
        return comercio.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ComercioEntity>> getComercios() {
        List<ComercioEntity> comercio = comercioService.getComercios();
        return ResponseEntity.ok(comercio);
    }

}
