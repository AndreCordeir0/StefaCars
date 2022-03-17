package com.stefanini.stefacars.entity;

import com.stefanini.stefacars.dto.CarroDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name = "tb_carro")
public class Carro {

    @Id
    @Column(name = "id_carro")
    private Long id;

    @Column
    private String nome;

    @Column
    private Long preco;

    @Column
    private Long velocidade;

    @Column
    private Long torque;

    @Column
    private Long aceleracao;

    @Column
    private Long drift;

    @Column
    private Long controle;

    @Lob
    @Column
    private String foto;

    public Carro() {
    }

    public Carro(CarroDTO carroDTO) {
        this.id = carroDTO.getId();
        this.nome = carroDTO.getNome();
        this.preco = carroDTO.getPreco();
        this.velocidade = carroDTO.getVelocidade();
        this.torque = carroDTO.getTorque();
        this.aceleracao = carroDTO.getAceleracao();
        this.drift = carroDTO.getDrift();
        this.controle = carroDTO.getControle();
        this.foto = carroDTO.getFoto();
    }
}
