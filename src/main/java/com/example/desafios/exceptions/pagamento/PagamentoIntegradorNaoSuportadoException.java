package com.example.desafios.exceptions.pagamento;

public class PagamentoIntegradorNaoSuportadoException extends RuntimeException {
    public PagamentoIntegradorNaoSuportadoException(String message) {
        super("Integrador não suportado: " + message);
    }
}
