package com.asesofware.PruebaAsesoftware.Repository;

import com.asesofware.PruebaAsesoftware.Entity.ServiciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiciosRepository extends JpaRepository<ServiciosEntity, Long> {

    ServiciosEntity findServicosByIdComercio(Long idComercio);
}
