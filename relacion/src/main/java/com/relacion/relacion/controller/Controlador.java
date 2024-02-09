package com.relacion.relacion.controller;
import com.relacion.relacion.modelos.Domicilio;
import com.relacion.relacion.repositorio.DomicilioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    private DomicilioRepositorio domicilioRepositorio;

    @GetMapping("/saludo")
    @ResponseBody
    public Domicilio obtenerSaludo() {
    Domicilio dom =domicilioRepositorio.getReferenceById(8l);
        return dom;
    }
}