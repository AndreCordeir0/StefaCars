package com.stefanini.stefacars.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Jogador {

    @ManyToOne
    @JoinColumn(name="id_carro")
    private Carro carro;

    public Jogador() {
    }
}
