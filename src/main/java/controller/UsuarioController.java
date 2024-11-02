package controller;

import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usuario.DadosUsuario;
import usuario.Usuario;
import usuario.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioRepository repository;
    
    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosUsuario dadosUsuario){
        repository.save(new Usuario(dadosUsuario));

    }
    
}
