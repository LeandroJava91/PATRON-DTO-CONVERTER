package com.relacion.relacion.repositorio;
import com.relacion.relacion.modelos.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepositorio extends JpaRepository<Domicilio,Long>{



   @Query("from Domicilio d where d.persona.nombre=?1")
    Iterable<Domicilio>buscarDomicilioPorNombre(String nombre);
}
