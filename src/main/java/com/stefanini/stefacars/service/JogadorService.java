package com.stefanini.stefacars.service;

import com.stefanini.stefacars.dto.JogadorDTO;
import com.stefanini.stefacars.dto.LoginDTO;
import com.stefanini.stefacars.entity.Jogador;
import com.stefanini.stefacars.repository.JogadorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class JogadorService {

    @Inject
    JogadorRepository jogadorRepository;

    public void salvar(Jogador jogador) {
        try {
            jogadorRepository.save(jogador);
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao cadastrar o Jogador");
        }
    }

    public Jogador pegarPorId(Long id) {
        var jogador = jogadorRepository.findById(id);
        if(Objects.isNull(jogador)) {
            throw new RuntimeException("Ocorreu um erro ao buscar o Jogador");
        }
        return jogador;
    }

    public void alterar(Jogador jogador) {
        try {
            jogadorRepository.update(jogador);
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao alterar o Jogador");
        }
    }

    public void deletar(Long id) {
        try {
            jogadorRepository.delete(id);
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao deletar o Jogador");
        }
    }

    public List<Jogador> listarTodos() {
        return jogadorRepository.listAll();
    }

    public JogadorDTO login(JogadorDTO login){
        return jogadorRepository.login(login);
    }
}
