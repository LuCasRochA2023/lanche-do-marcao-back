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

    public Lanche(DadosLanche lanche) {
        this.nome = lanche.nome();
        this.descricao = lanche.descricao();
        this.preco = lanche.preco();
        this.imagem = lanche.imagem();
        this.ativo = true;
    }


}
