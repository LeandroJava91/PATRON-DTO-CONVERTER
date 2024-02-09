package com.relacion.relacion.repositorio;

import com.relacion.relacion.modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
}
