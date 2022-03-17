package com.stefanini.stefacars.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_circuito")
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private Double percurso;

    @Column
    private Long voltas;

    @Column
    private Long curvas;

    @Lob
    @Column
    private String foto;

    public Circuito() {
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

    public Double getPercurso() {
        return percurso;
    }

    public void setPercurso(Double percurso) {
        this.percurso = percurso;
    }

    public Long getVoltas() {
        return voltas;
    }

    public void setVoltas(Long voltas) {
        this.voltas = voltas;
    }

    public Long getCurvas() {
        return curvas;
    }

    public void setCurvas(Long curvas) {
        this.curvas = curvas;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
