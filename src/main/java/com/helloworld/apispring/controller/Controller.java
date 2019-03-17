package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.ReporteR;
import com.helloworld.apispring.model.entity.Ciudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/ensusmanos")
public class Controller {

    @Autowired
    private CiudadanoServicio ciudadanoServicio;
    
    private ReporteServicio reporteServicio;

    @RequestMapping(value = "/ciudadanos/", method = RequestMethod.GET)
    public ResponseEntity<List<Ciudadano>> obtenerCiudadanos() {
        List<Ciudadano> ciudadanos = ciudadanoServicio.getAllCiudadanos();
        return new ResponseEntity<List<Ciudadano>>(ciudadanos, HttpStatus.OK);
    }

    @RequestMapping(value = "/ciudadanos/{id}", method = RequestMethod.GET)
    public ResponseEntity<Ciudadano> obtenerCiudadanoPorID(@PathVariable("id") int id) {
        Ciudadano ciudadano = ciudadanoServicio.getCiudadanoByID(id);
        return new ResponseEntity<Ciudadano>(ciudadano, HttpStatus.OK);
    }

    @RequestMapping(value = "/ciudadanos/ordenados", method = RequestMethod.GET)
    public ResponseEntity<List<Ciudadano>> obtenerCiudadanoOrdenado() {
        List<Ciudadano> ciudadanos = ciudadanoServicio.getAllCiudadanoOrdenado();
        return new ResponseEntity<List<Ciudadano>>(ciudadanos, HttpStatus.OK);
    }

    
    @RequestMapping(value = "/ciudadanos/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearCiudadano(@RequestBody Ciudadano ciudadano) {
        String resultado2 = "Se creo CIUDADANO con el siguiente número de ID: " + ciudadanoServicio.crearCiudadano(ciudadano);
        return new ResponseEntity<String>(resultado2, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/reportes/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearReporteR(@RequestBody ReporteR reporte){
        String resultado = "Se creo reporte con ID: " + reporteServicio.crearReporteR(reporte);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
    
    
    
    
}
