package com.stefanini.stefacars.service;

import com.stefanini.stefacars.entity.Carro;
import com.stefanini.stefacars.repository.CarroRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;


public class CarroService {

    @Inject
    CarroRepository carroRepository;

    public List<Carro> listarTodos(){
        return carroRepository.listAll();
    }

    public Carro pegarPorId(Long id) {
        var carro =  carroRepository.findById(id);
        if(Objects.isNull(carro)) {
            throw new RuntimeException("Ocorreu um erro ao buscar o Carro");
        }
        return carro;
    }
 }
