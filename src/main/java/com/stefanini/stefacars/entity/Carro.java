package com.stefanini.stefacars.entity;

import com.stefanini.stefacars.dto.CarroDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public Long getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Long velocidade) {
        this.velocidade = velocidade;
    }

    public Long getTorque() {
        return torque;
    }

    public void setTorque(Long torque) {
        this.torque = torque;
    }

    public Long getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Long aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Long getDrift() {
        return drift;
    }

    public void setDrift(Long drift) {
        this.drift = drift;
    }

    public Long getControle() {
        return controle;
    }

    public void setControle(Long controle) {
        this.controle = controle;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
}
