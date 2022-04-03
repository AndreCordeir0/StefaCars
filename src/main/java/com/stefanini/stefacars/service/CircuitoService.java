package com.stefanini.stefacars.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.stefanini.stefacars.entity.Circuito;
import com.stefanini.stefacars.repository.CircuitoRepository;

@ApplicationScoped
public class CircuitoService {
   @Inject
   CircuitoRepository circuitoRepository;
   
   
   public List<Circuito> listarCircuito(){
       return circuitoRepository.listAll();
   }

   public Circuito pegarCircuitoPorID(Long id){
       return circuitoRepository.findById(id);
   }
}
