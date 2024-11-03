package com.example.demo.controller;

import com.example.demo.service.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.usuario.DadosUsuario;
import com.example.demo.usuario.Usuario;
import com.example.demo.usuario.UsuarioRepository;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private UsuarioService service;
    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@Valid @RequestBody  DadosUsuario dadosUsuario) {
        service.cadastrar(dadosUsuario);
        URI location = URI.create("/usuarios/" + dadosUsuario.email()); // Substitua por um ID único do usuário, se aplicável
        return ResponseEntity.created(location).build();
    }

    @GetMapping  // Endpoint para listagem
    public List<Usuario> listar() {
        return repository.findAll();
    }
}
