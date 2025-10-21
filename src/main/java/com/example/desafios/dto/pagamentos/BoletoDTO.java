package com.example.desafios.dto.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.integrator.spi.Integrator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoletoDTO {

    @Nonnull
    private PagamentoIntegrador integrator;
    @Nonnull
    private String base64;
    private String codigoBoleto;

    public BoletoDTO(PagamentoIntegrador pagamentoIntegrador, String base64) {
        this.base64 = base64;
        this.integrator = pagamentoIntegrador;
    }
}
