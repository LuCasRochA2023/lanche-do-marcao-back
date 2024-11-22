package com.example.demo.lanche;


import jakarta.persistence.*;
import jdk.jfr.Label;
import lombok.*;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;

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
    private BigDecimal preco;
    private Integer quantidade;
    private boolean ativo;

    public Lanche(DadosLanche lanche) {
        this.nome = lanche.nome();
        this.descricao = lanche.descricao();
        this.preco = lanche.preco();
        this.quantidade = lanche.quantidade();
        this.ativo = true;
    }


}
