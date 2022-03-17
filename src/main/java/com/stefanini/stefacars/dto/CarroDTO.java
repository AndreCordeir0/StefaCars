package com.stefanini.stefacars.dto;

public class CarroDTO {

    private Long id;

    private String nome;

    private Long preco;

    private Long velocidade;

    private Long torque;

    private Long aceleracao;

    private Long drift;

    private Long controle;

    private String foto;

    public CarroDTO() {
    }

    public CarroDTO(Long id, String nome, Long preco, Long velocidade, Long torque, Long aceleracao, Long drift, Long controle, String foto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.velocidade = velocidade;
        this.torque = torque;
        this.aceleracao = aceleracao;
        this.drift = drift;
        this.controle = controle;
        this.foto = foto;
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
