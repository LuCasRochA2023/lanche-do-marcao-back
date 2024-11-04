package com.example.demo.lanche;


import jakarta.persistence.*;
import jdk.jfr.Label;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    @Lob
    private byte[] imagem;
    private boolean ativo;

    public Lanche(String nome, String descricao, Double preco, byte[] imagem, boolean ativo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.ativo = true;
    }


}
