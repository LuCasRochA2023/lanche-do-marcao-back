package com.example.demo.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.usuario.DadosUsuario;
import com.example.demo.usuario.Usuario;
import com.example.demo.usuario.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@Valid @RequestBody  DadosUsuario dadosUsuario) {
        repository.save(new Usuario(dadosUsuario));
        return ResponseEntity.ok().build();
    }

    @GetMapping  // Endpoint para listagem
    public List<Usuario> listar() {
        return repository.findAll();
    }
}
