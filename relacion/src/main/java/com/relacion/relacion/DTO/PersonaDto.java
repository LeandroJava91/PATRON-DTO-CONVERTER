package com.relacion.relacion.DTO;

import java.util.List;

public class PersonaDto {

    private String nombre;
    private String apellido;

   private List<DomicilioDto>domicilios;

    public PersonaDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<DomicilioDto> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<DomicilioDto> domicilios) {
        this.domicilios = domicilios;
    }

    @Override
    public String toString() {
        return "PersonaDto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilios=" + domicilios +
                '}';
    }
}
