package com.example.desafios.services.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import com.example.desafios.dto.pagamentos.BoletoDTO;
import com.example.desafios.dto.pagamentos.GerarBoletoDTO;
import com.example.desafios.interfaces.pagamentos.GeradorBoletosInterface;
import org.springframework.stereotype.Service;

@Service
public class GeradorBoletosSegundo implements GeradorBoletosInterface {

    @Override
    public PagamentoIntegrador getIntegrator() {return PagamentoIntegrador.PAGADORO;}

    @Override
    public BoletoDTO gerar(GerarBoletoDTO dto) {
        return null;
    }

    @Override
    public String gerarCodigo(GerarBoletoDTO dto) {
        return "";
    }
}
