package com.example.demo.service;


import com.example.demo.lanche.DadosLanche;
import com.example.demo.lanche.Lanche;
import com.example.demo.lanche.LancheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LancheService {

    @Autowired
    private LancheRepository lancheRepository;
    public Lanche cadastrar(DadosLanche lanchedados) {
        Lanche lanche = new Lanche(lanchedados);


        return lancheRepository.save(lanche);
    }
    public List<Lanche> cadastrarLanches(List<DadosLanche> lanchesDados) {
        List<Lanche> lanches = new ArrayList<>();
        for (DadosLanche dadosLanche : lanchesDados) {
            Lanche lanche = new Lanche(dadosLanche);
            lanches.add(lanche);
        }
        return lancheRepository.saveAll(lanches);
    }

    public Iterable<Lanche> listarTodos() {
        return lancheRepository.findAll();
    }
}
