package com.example.desafios.services.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import com.example.desafios.dto.pagamentos.BoletoDTO;
import com.example.desafios.dto.pagamentos.GerarBoletoDTO;
import com.example.desafios.interfaces.pagamentos.GeradorBoletosInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class GeradorBoletosPrimeiro implements GeradorBoletosInterface {

    @Override
    public PagamentoIntegrador getIntegrator() {return PagamentoIntegrador.PAGADORA;}

    @Override
    public BoletoDTO gerar(GerarBoletoDTO dto) {
        var boleto = new BoletoDTO(PagamentoIntegrador.PAGADORO, "Base64");
        return boleto;
    }

    @Override
    public String gerarCodigo(GerarBoletoDTO dto) {
        throw new UnsupportedOperationException("Primeiro não gera código de barras diretamente.");

    }

}
