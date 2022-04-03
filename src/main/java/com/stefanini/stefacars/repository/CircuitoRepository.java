package com.stefanini.stefacars.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import com.stefanini.stefacars.dao.GenericDAO;
import com.stefanini.stefacars.dto.CircuitoDTO;
import com.stefanini.stefacars.entity.Circuito;

@ApplicationScoped
public class CircuitoRepository extends GenericDAO<Circuito,Long> {
    

    public List<CircuitoDTO> listarCircuito(){
        List<Circuito> listarCircuito = this.listAll();
        return listarCircuito.stream().map(CircuitoDTO::new).collect(Collectors.toList());
    }

    public CircuitoDTO pegarCircuitoPorID(Long id){
        try{
            return new CircuitoDTO(this.findById(id));
        }catch(Exception e){
           throw new RuntimeException("Circuito não existe");
        }
    }
}
