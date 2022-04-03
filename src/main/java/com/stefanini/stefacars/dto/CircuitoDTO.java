package com.stefanini.stefacars.dto;

import com.stefanini.stefacars.entity.Circuito;

public class CircuitoDTO {
    
private Long id;
private String nome;
private Double percurso;
private Long voltas;
private Long curvas;
private String foto;

public CircuitoDTO(){
    
}

public CircuitoDTO(Circuito circuito){
this.id = circuito.getId();
this.nome = circuito.getNome();
this.percurso=circuito.getPercurso();
this.voltas = circuito.getVoltas();
this.curvas = circuito.getCurvas();
this.foto = circuito.getFoto();


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
