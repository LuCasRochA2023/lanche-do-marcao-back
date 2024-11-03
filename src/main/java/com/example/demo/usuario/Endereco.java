package com.example.demo.usuario;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;

    public Endereco(DadosEndereco dados) {
        this.cep = dados.cep();
        this.rua = dados.rua();
        this.numero = dados.numero();

        this.bairro = dados.bairro();

        this.complemento = dados.complemento();

    }

    
    
}
