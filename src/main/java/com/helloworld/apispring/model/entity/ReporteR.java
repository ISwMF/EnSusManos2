package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "reportes")

public class ReporteR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reportes")
    private Integer reporteId;

    @Column
    private String fecha;

    @Column
    private String hora;

    @Column
    private String lugar;

    @Column
    private String situacion;

    @Column
    private Integer puntos;

    //@Column
    //private Integer id_ciudadano;

    public ReporteR() {
    }

    public Integer getReporteId() {
        return reporteId;
    }

    public void setReporteId(Integer reporteId) {
        this.reporteId = reporteId;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPoints(Integer puntos) {
        this.puntos = puntos;
    }

    @ManyToOne
    @JoinColumn(name = "id_ciudadano")
    private Ciudadano ciudadano;
    
    @Transient
    private int id_ciudadano; 

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public int getId_ciudadano() {
        return id_ciudadano;
    }

    public void setId_ciudadano(int id_ciudadano) {
        this.id_ciudadano = id_ciudadano;
    }

           

}
