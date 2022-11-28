package com.asteci.demo.controller;

import com.asteci.demo.dto.Incidencia;
import com.asteci.demo.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class IncidenciaController {

    @Autowired
    private IncidenciaService incidenciaService;

    @GetMapping("incidenciaId/{id}")
    public Incidencia findIncidenciaById(@PathVariable Integer id){
        System.out.println("incidencia ID: " + id);
        Incidencia incidencia = incidenciaService.findIncidenciaById(id);
        return incidencia;
    }

    @GetMapping("incidenciaFecha/{fecha}")
    public Incidencia findIncidenciaByDate(@PathVariable Date fecha){
        System.out.println("incidencia fecha: " + fecha);
        Incidencia incidencia = incidenciaService.findIncidenciaByDate(fecha);
        return incidencia;
    }

    @GetMapping("incidenciaOperador/{idOperador}")
    public Incidencia findIncidenciaByOperador(@PathVariable Integer idOperador){
        System.out.println("incidencia operador: " + idOperador);
        Incidencia incidencia = incidenciaService.findIncidenciaByOperador(idOperador);
        return incidencia;
    }

    @PostMapping("incidencia")
    public Incidencia saveIncidencia(@RequestBody Incidencia incidencia){
        System.out.println("incidencia operador: " + incidencia);
        return incidenciaService.saveIncidencia(incidencia);
    }
}
