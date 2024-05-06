package com.asesofware.PruebaAsesoftware.Service;

import com.asesofware.PruebaAsesoftware.Entity.ServiciosEntity;
import com.asesofware.PruebaAsesoftware.Repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServiciosRepository servicioRepository;

    public Optional<ServiciosEntity> getServicioById(Long id) {
        return servicioRepository.findById(id);
    }
}
