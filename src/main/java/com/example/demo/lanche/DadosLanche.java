package com.example.demo.lanche;

import jakarta.validation.constraints.NotBlank;

import java.awt.image.BufferedImage;

public record DadosLanche(@NotBlank String nome, @NotBlank String descricao, @NotBlank Double preco, @NotBlank
                          byte[] imagem) {
}
