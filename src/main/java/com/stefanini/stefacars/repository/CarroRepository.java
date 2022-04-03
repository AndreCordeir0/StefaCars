package com.stefanini.stefacars.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import com.stefanini.stefacars.dao.GenericDAO;
import com.stefanini.stefacars.dto.CarroDTO;
import com.stefanini.stefacars.entity.Carro;


@ApplicationScoped
public class CarroRepository extends GenericDAO<Carro, Long> {


public List<CarroDTO> listarCarros(){
    List<Carro> listarCarros = this.listAll();
    return listarCarros.stream().map(CarroDTO::new).collect(Collectors.toList());
}

public CarroDTO buscarPorId(Long id){
    try {
        return new CarroDTO(this.findById(id));
        
    } catch (Exception e) {
        throw new RuntimeException("Carro não existe!");
    }
}
}
