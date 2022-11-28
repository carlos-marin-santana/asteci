package com.asteci.demo.service.impl;

import com.asteci.demo.dto.Incidencia;
import com.asteci.demo.repository.IncidenciaRepository;
import com.asteci.demo.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class IncidenciaServiceImpl implements IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;
    @Override
    public Incidencia findIncidenciaById(Integer id) {
        Optional<Incidencia> optional = incidenciaRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Incidencia findIncidenciaByDate(Date fecha) {
        return incidenciaRepository.findByFecha(fecha);
    }

    @Override
    public Incidencia findIncidenciaByOperador(Integer idOperador) {
        return incidenciaRepository.findByIdOperador(idOperador);
    }

    @Override
    public Incidencia saveIncidencia(Incidencia incidencia) {
       return incidenciaRepository.save(incidencia);
    }
}
