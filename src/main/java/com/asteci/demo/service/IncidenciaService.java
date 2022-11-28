package com.asteci.demo.service;

import com.asteci.demo.dto.Incidencia;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public interface IncidenciaService {

    Incidencia findIncidenciaById(Integer id);

    Incidencia findIncidenciaByDate(Date fecha);

    Incidencia findIncidenciaByOperador(Integer idOperador);

    Incidencia saveIncidencia (Incidencia incidencia);
}
