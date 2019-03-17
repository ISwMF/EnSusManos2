package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.ReporteRepositorio;
import com.helloworld.apispring.model.entity.ReporteR;
import com.helloworld.apispring.model.dao.CiudadanoRepositorio;
import com.helloworld.apispring.model.entity.Ciudadano;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class CiudadanoServicio {

    @Autowired
    private CiudadanoRepositorio ciudadanoRepositorio;
    private ReporteRepositorio reporteRepositorio;

    public CiudadanoServicio() { 
   }

    public List<Ciudadano> getAllCiudadanos() {
        return ciudadanoRepositorio.getAllCiudadanos();
    }

    public Ciudadano getCiudadanoByID(int id) {
        return ciudadanoRepositorio.getCiudadanoByID(id);
    }
    
    public List<Ciudadano> getAllCiudadanoOrdenado() {
        return ciudadanoRepositorio.getCiudadanoOrdenado();
    }

    public long crearCiudadano(Ciudadano ciudadano){
        return ciudadanoRepositorio.crearCiudadano(ciudadano);
    }
    
    public long crearReporteR(ReporteR reporte){
        return reporteRepositorio.crearReporteR(reporte);
    }
    
    
}
