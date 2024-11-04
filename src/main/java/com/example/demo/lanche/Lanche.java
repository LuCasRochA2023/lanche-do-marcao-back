package com.example.demo.lanche;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.awt.image.BufferedImage;

@Table(name = "lanche")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lanche {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private byte[] imagem;

    public Lanche(String nome, String descricao, Double preco, byte[] imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }
}
