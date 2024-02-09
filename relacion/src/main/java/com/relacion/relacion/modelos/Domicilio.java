package com.relacion.relacion.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idomiciliox")
    private long id;
    @Column(nullable = false, length = 50, name = "callex")
    private String calle;
    @Column(nullable = false, length = 50, name = "localidax")
    private String localidad;
    @ManyToOne(
            cascade = CascadeType.ALL,
            optional = true
    )
    @JoinColumn(name="idPersonax")
    @JsonIgnore
    private Persona persona;

    public Domicilio() {
    }

    public Domicilio( String calle, String localidad) {
        this.calle = calle;
        this.localidad = localidad;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", localidad='" + localidad + '\'' +
                //", persona=" + persona +
                '}';
    }
}
