package com.example.demo.service;


import com.example.demo.lanche.DadosLanche;
import com.example.demo.lanche.Lanche;
import com.example.demo.lanche.LancheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancheService {

    @Autowired
    private LancheRepository lancheRepository;

    public Lanche cadastrar(DadosLanche lanchedados) {
        Lanche lanche = new Lanche(lanchedados);
        return lancheRepository.save(lanche);
    }

    public Optional<Lanche> buscarPorNome(String nome) {
        return lancheRepository.findByNome(nome);
    }

    public Iterable<Lanche> listarTodos() {
        return lancheRepository.findAll();
    }
}
