package com.example.desafios.interfaces.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import com.example.desafios.dto.pagamentos.BoletoDTO;
import com.example.desafios.dto.pagamentos.GerarBoletoDTO;

public interface GeradorBoletosInterface {

    PagamentoIntegrador getIntegrator();

    BoletoDTO gerar(GerarBoletoDTO dto);

    String gerarCodigo(GerarBoletoDTO dto);
}
