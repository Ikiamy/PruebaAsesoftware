package com.asesofware.PruebaAsesoftware.Service;

import com.asesofware.PruebaAsesoftware.Entity.ComercioEntity;
import com.asesofware.PruebaAsesoftware.Repository.ComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComercioService {

    @Autowired
    private ComercioRepository comercioRepository;

    public Optional<ComercioEntity> getComercioById(Long id) {
        return comercioRepository.findById(id);
    }

    public List<ComercioEntity> getComercios() {
        return comercioRepository.findAll();
    }

}
