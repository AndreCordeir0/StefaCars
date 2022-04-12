package com.stefanini.stefacars.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import javax.persistence.Query;

import com.stefanini.stefacars.dao.GenericDAO;
import com.stefanini.stefacars.dto.JogadorDTO;
import com.stefanini.stefacars.dto.LoginDTO;
import com.stefanini.stefacars.entity.Jogador;

@ApplicationScoped
public class JogadorRepository extends GenericDAO<Jogador, Long> {

public List<JogadorDTO> listarJogadores(){
List<Jogador> listarJogadores = this.listAll();
return listarJogadores.stream().map(JogadorDTO::new).collect(Collectors.toList());
}

public JogadorDTO pegarPorId(Long id){
   try{
       return new JogadorDTO(this.findById(id));
   }
   catch(Exception e){
       throw new RuntimeException("Jogador não existe");
   }
}

@Transactional
public  JogadorDTO salvarJogador(JogadorDTO jogadorDTO){
    Jogador jogador = new Jogador(jogadorDTO);
    this.save(jogador);
    return new JogadorDTO(jogador);
}

@Transactional
public JogadorDTO alterarJogador(JogadorDTO jogadorDTO){
    Jogador jogador = new Jogador(jogadorDTO);
    this.update(jogador);
    return new JogadorDTO(jogador);

}

@Transactional
public void excluirJogador(Long id){
    try{
     this.delete(id);
    }
    catch(Exception e){
        throw new RuntimeException("Jogador não existe");
    }
}


public JogadorDTO login(JogadorDTO login){
    Jogador jogador = null;
    try{
        Query nativQuery = this.createNativeQuery("SELECT * FROM tb_jogador WHERE nickname = ? and senha = ? ");
        nativQuery.setParameter(1,login.getNickname());
        nativQuery.setParameter(2,login.getSenha());
        jogador =(Jogador) nativQuery.getResultList().get(0);
        return new JogadorDTO(jogador);
        
    }
    catch (Exception erro) {
        throw new RuntimeException("Login ou Senha incorretos!");
    }
}
}
