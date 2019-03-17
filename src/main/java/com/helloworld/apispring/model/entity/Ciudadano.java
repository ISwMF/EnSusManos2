package com.helloworld.apispring.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadanos")
public class Ciudadano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudadano")
    private int id;

    @Column(name = "nombre_ciudadano")
    private String nombre;

    @Column
    private int puntos_ciudadano;

    public Ciudadano() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre_ciudadano(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos_ciudadano() {
        return puntos_ciudadano;
    }

    public void setPuntos_ciudadano(int puntos_ciudadano) {
        this.puntos_ciudadano = puntos_ciudadano;
    }

    @OneToMany(mappedBy = "ciudadano")
    private List<ReporteR> listaReportes;

}
