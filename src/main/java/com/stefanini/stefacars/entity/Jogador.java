package com.stefanini.stefacars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.stefanini.stefacars.dto.JogadorDTO;

@Entity
@Table(name = "tb_jogador")
public class Jogador {

    @ManyToOne
    @JoinColumn(name="id_carro")
    private Carro carro;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_jogador")
private Long id;

@Column(unique = true)
private String nickname;

@Column
@NotEmpty
private String senha;

@Column
private int saldo = 100;

    public Jogador() {
        
    }

    
    public Jogador(JogadorDTO jogadorDTO) {
        this.carro=jogadorDTO.getCarro();
        this.id=jogadorDTO.getId();
        this.nickname=jogadorDTO.getNickname();
        this.senha=jogadorDTO.getSenha();
        this.saldo=jogadorDTO.getSaldo();

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
