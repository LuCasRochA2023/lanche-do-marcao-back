package com.example.demo.controller;

import com.example.demo.lanche.Lanche;
import com.example.demo.lanche.LancheRepository;
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

    public ResponseEntity<Void> adicionarAoCarrinho(@Valid @RequestBody Lanche lanche) {
        lancheRepository.save(lanche);
        return ResponseEntity.noContent().build();
    }
}
