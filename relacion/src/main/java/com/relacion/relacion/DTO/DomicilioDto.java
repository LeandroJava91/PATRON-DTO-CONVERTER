package com.relacion.relacion.DTO;

public class DomicilioDto {

    private String calle;
    private String localidad;

    public DomicilioDto() {
    }

    public DomicilioDto(String calle, String localidad) {
        this.calle = calle;
        this.localidad = localidad;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "DomicilioDto{" +
                "calle='" + calle + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
