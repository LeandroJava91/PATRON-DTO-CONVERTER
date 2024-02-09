package com.relacion.relacion.DTO;



import com.relacion.relacion.modelos.Domicilio;
import com.relacion.relacion.modelos.Persona;
import com.relacion.relacion.repositorio.DomicilioRepositorio;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaDtoConver implements Converter<Persona, PersonaDto> {

    @Autowired
    private DomicilioRepositorio domicilioRepositorio;

    @Override
    public PersonaDto convert(Persona persona) {
        PersonaDto personaDto  = new PersonaDto();
        personaDto.setNombre(persona.getNombre());
        personaDto.setApellido(persona.getApellido());

        Iterable<Domicilio>domicilios=domicilioRepositorio.buscarDomicilioPorNombre(persona.getNombre());
        List<DomicilioDto> domiciliosDTO = new ArrayList<>();

        for(Domicilio domicliox: domicilios){
            DomicilioDto dom= new DomicilioDto();
            dom.setCalle(domicliox.getCalle());
            dom.setLocalidad(domicliox.getLocalidad());
            domiciliosDTO.add(dom);
        }
        personaDto.setDomicilios(domiciliosDTO);
        return personaDto;
    }


}
