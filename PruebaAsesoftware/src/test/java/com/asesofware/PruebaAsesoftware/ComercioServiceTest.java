package com.asesofware.PruebaAsesoftware;

import com.asesofware.PruebaAsesoftware.Entity.ComercioEntity;
import com.asesofware.PruebaAsesoftware.Service.ComercioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComercioServiceTest {

    @Autowired
    private ComercioService comercioService;

    @Test
    public void testGetComercioById() {
        Long idComercio = 1L;

        Optional<ComercioEntity> comercio = comercioService.getComercioById(idComercio);

        assertTrue(comercio.isPresent());
    }
}
