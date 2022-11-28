package com.asteci.demo.configuration;

import com.asteci.demo.dto.Equipo;
import com.asteci.demo.dto.Operador;
import com.asteci.demo.dto.Status;
import com.asteci.demo.repository.EquipoRepository;
import com.asteci.demo.repository.IncidenciaRepository;
import com.asteci.demo.repository.OperadorRepository;
import com.asteci.demo.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {
    private EquipoRepository equipoRepository;
    private OperadorRepository operadorRepository;
    private StatusRepository statusRepository;

    @Autowired
    public DataLoader(EquipoRepository equipoRepository, OperadorRepository operadorRepository, StatusRepository statusRepository){
        this.equipoRepository = equipoRepository;
        this.operadorRepository = operadorRepository;
        this.statusRepository = statusRepository;
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales(){
        Status status1 = new Status();
        Status status2 = new Status();
        status1.setDescripcion("Resuelto");
        status2.setDescripcion("Abierto");

        Equipo equipo = new Equipo();
        equipo.setDescripcion("Computadora");

        Operador operador = new Operador();
        operador.setNombre("Alberto Corral");

        statusRepository.saveAll(List.of(status1, status2));
        equipoRepository.save(equipo);
        operadorRepository.save(operador);

        var operadores = operadorRepository.findAll();
        var equipos = equipoRepository.findAll();
        var status = statusRepository.findAll();

        System.out.println("Carga terminada");

    }
}
