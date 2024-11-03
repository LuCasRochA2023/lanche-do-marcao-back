/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.example.demo.usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author guilh
 */
public record DadosUsuario(@NotBlank String nome, @NotBlank @Email String email, @NotBlank String senha, @Valid  DadosEndereco endereco) {
    
    

}
