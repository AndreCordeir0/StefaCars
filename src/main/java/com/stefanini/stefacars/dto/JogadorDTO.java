package com.stefanini.stefacars.dto;

import javax.validation.constraints.Size;

import com.stefanini.stefacars.entity.Carro;
import com.stefanini.stefacars.entity.Jogador;

public class JogadorDTO {
    
    private Carro carro;

    private Long id;

    private String nickname;

    @Size(min = 4,max = 10)
    private String senha;

    private int saldo = 100;
    
    public JogadorDTO(){

    }
    public JogadorDTO(Jogador jogador){
        this.carro=jogador.getCarro();
        this.id=jogador.getId();
        this.nickname=jogador.getNickname();
        this.senha=jogador.getSenha();
        this.saldo=jogador.getSaldo();
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

}
