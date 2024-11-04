package com.example.demo.controller;

import com.example.demo.lanche.DadosLanche;
import com.example.demo.lanche.Lanche;
import com.example.demo.lanche.LancheRepository;
import com.example.demo.service.LancheService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lanche")
public class LancheController {
    @Autowired
    private LancheRepository lancheRepository;
    private LancheService service;

    public ResponseEntity<Void> adicionarAoCarrinho(@Valid @RequestBody DadosLanche lanche) {
        service.cadastrar(lanche);
        return ResponseEntity.noContent().build();
    }
}
