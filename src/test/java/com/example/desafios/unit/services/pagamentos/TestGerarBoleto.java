package com.example.desafios.unit.services.pagamentos;

import com.example.desafios.constants.PagamentoIntegrador;
import com.example.desafios.controller.pagamentos.PagamentosController;
import com.example.desafios.dto.pagamentos.BoletoDTO;
import com.example.desafios.dto.pagamentos.GerarBoletoDTO;
import com.example.desafios.utils.ValidateRules;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestGerarBoleto {

    @Autowired
    private PagamentosController pagamentosController;


    @Test
    void gerarBoletoPrimeiro() {
        GerarBoletoDTO gerarBoletoDTO = new GerarBoletoDTO(PagamentoIntegrador.PAGADORA, "000.000.001-91");

        BoletoDTO response = pagamentosController.gerarBoleto(gerarBoletoDTO);

//        assertTrue(ValidateRules.checkBoletoCodigo(response.getCodigoBoleto()));
        assertTrue(!response.getBase64().isEmpty());
    }
}
