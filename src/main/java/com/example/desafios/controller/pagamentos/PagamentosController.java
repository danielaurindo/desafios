package com.example.desafios.controller.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import com.example.desafios.dto.pagamentos.BoletoDTO;
import com.example.desafios.dto.pagamentos.GerarBoletoDTO;
import com.example.desafios.exceptions.pagamento.PagamentoIntegradorNaoSuportadoException;
import com.example.desafios.interfaces.pagamentos.GeradorBoletosInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Controller
public class PagamentosController {

    private final List<GeradorBoletosInterface> pagamentosIntegrador;

    public PagamentosController(List<GeradorBoletosInterface> pagamentosIntegrador) {
        this.pagamentosIntegrador = pagamentosIntegrador;
    }


    public BoletoDTO gerarBoleto(GerarBoletoDTO gerarBoletoDTO) {

        PagamentoIntegrador pagamentoIntegrador = PagamentoIntegrador.valueOf(gerarBoletoDTO.getExecutor().name());

        GeradorBoletosInterface gerador = pagamentosIntegrador.stream()
                .filter(p -> p.getIntegrator().equals(pagamentoIntegrador))
                .findFirst()
                .orElseThrow();

        return gerador.gerar(gerarBoletoDTO);

    }
}
