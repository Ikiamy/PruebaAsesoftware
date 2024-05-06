package com.asesofware.PruebaAsesoftware;

import com.asesofware.PruebaAsesoftware.Entity.ServiciosEntity;
import com.asesofware.PruebaAsesoftware.Service.ServicioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicioServiceTest {

    @Autowired
    private ServicioService servicioService;

    @Test
    public void testGetServicioById() {
        Long idServicio = 1L;

        Optional<ServiciosEntity> servicio = servicioService.getServicioById(idServicio);

        assertTrue(servicio.isPresent());
    }
}
