package com.relacion.relacion;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.relacion.relacion.DTO.PersonaDto;
import com.relacion.relacion.DTO.PersonaDtoConver;
import com.relacion.relacion.modelos.Domicilio;
import com.relacion.relacion.repositorio.DomicilioRepositorio;
import com.relacion.relacion.repositorio.PersonaRepositorio;
import com.relacion.relacion.modelos.Persona;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComandosSQL implements CommandLineRunner{

@Autowired
private PersonaRepositorio personaRepositorio;

@Autowired
private DomicilioRepositorio domicilioRepositorio;

@Autowired
private PersonaDtoConver personaDtoConver;


@Override
    public void run(String... args) throws Exception{
/*
    Persona per5= new Persona("negro","forro");
    //personaRepositorio.save(per4);

  Domicilio dom2= new Domicilio("alsina 335","caba");
  dom2.setPersona(per5);

  domicilioRepositorio.save(dom2);
 // personaRepositorio.findAll();
    System.out.println("hola mundo");

 */
   // Persona perso= new Persona("leadf","fdssdf");//personaRepositorio.findById(1L).get();

//    System.out.println(perso);

//Persona per= personaRepositorio.findById(8l).orElse(null);
  //  System.out.println(per);
   // List<Domicilio>domicilios= (List<Domicilio>) domicilioRepositorio.buscarDomicilioPorNombre("pepe");

   // domicilios.forEach(elemento->System.out.println(elemento));
    Persona per= personaRepositorio.findById(8l).orElse(null);
    PersonaDto per1=personaDtoConver.convert(per);
    System.out.println(per1);


}
}
