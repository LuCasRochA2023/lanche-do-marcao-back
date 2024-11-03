package com.example.demo.usuario;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Table(name = "usuario")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;
    @Embedded
    private Endereco endereco;
    public Usuario(DadosUsuario dadosUsuario) {
        this.nome = dadosUsuario.nome();
        this.email = dadosUsuario.email();
        this.endereco = new Endereco(dadosUsuario.endereco());
        this.ativo = true;
    }
    public Usuario( String email, String senha) {
        this.senha = senha;
        this.email = email;
    }
}
