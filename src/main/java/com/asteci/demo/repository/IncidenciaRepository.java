package com.asteci.demo.repository;

import com.asteci.demo.dto.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer> {

    Incidencia findByFecha(Date fecha);

    Incidencia findByIdOperador(Integer idOperador);
}
