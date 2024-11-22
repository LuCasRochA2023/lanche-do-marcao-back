package com.example.demo.lanche;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Min;
import java.math.BigDecimal;

public record DadosLanche(
        @NotBlank(message = "Nome não deve estar em branco") String nome,
        @NotBlank(message = "Descrição não deve estar em branco") String descricao,
        @NotNull(message = "Preço não pode ser nulo") @Positive(message = "Preço deve ser maior que zero") BigDecimal preco,
        @Min(value = 1, message = "Quantidade deve ser maior ou igual a 1") Integer quantidade
) {
}
