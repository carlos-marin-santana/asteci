package com.asteci.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fecha;
    @Column(name = "id_equipo")
    private Integer idEquipo;
    @ManyToOne
    @JoinColumn(name = "id_equipo", insertable = false, updatable = false)
    private Equipo equipo;
    @Column(name = "id_operador")
    private Integer idOperador;
    @ManyToOne
    @JoinColumn(name = "id_operador", insertable = false, updatable = false)
    private Operador operador;
    @Column(name = "id_status")
    private Integer idStatus;
    @ManyToOne
    @JoinColumn(name = "id_status", insertable = false, updatable = false)
    private Status status;
    private String descripcion;

    public Status getStatus() {
        return status;
    }

    public Operador getOperador() {
        return operador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer id_operador) {
        this.idOperador = id_operador;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
