package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.CiudadanoRepositorio;
import com.helloworld.apispring.model.dao.ReporteRepositorio;
import com.helloworld.apispring.model.entity.Ciudadano;
import com.helloworld.apispring.model.entity.ReporteR;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ReporteServicio {

    @Autowired
    private ReporteRepositorio reporteRepositorio;
    @Autowired
    private CiudadanoRepositorio ciudadanoRepositorio;

    public ReporteServicio() {
    }

    public long crearCiudadano(Ciudadano ciudadano) {
        return ciudadanoRepositorio.crearCiudadano(ciudadano);
    }

    public long crearReporteR(ReporteR reporte) {
        Ciudadano ciudadano = ciudadanoRepositorio.obtenerCiudadanoPorID(reporte.getId_ciudadano());
        reporte.setCiudadano(ciudadano);
        return ciudadanoRepositorio.crearReporteR(reporte);
    }

}
