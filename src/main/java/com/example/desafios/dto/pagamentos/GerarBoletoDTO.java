package com.example.desafios.dto.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class GerarBoletoDTO {

    @Nonnull
    private PagamentoIntegrador executor;
    @Nonnull
    private String cpf;

}
