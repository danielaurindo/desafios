package com.example.desafios.unit.services.operadoreslogicos;


import com.example.desafios.interfaces.operadoreslogicos.DesafiosInterface;
import com.example.desafios.services.operadoreslogicos.DesafiosImpService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDesafiosService {

    private final DesafiosInterface desafiosService = new DesafiosImpService();

    @Test
    void deveSomarDoisNumeros(){
        int resultado = desafiosService.somar(3, 2);
        assertEquals(5, resultado);
    }

    @Test
    void deveRetornarExceptionSeTentarDividirPorZero(){

        Exception exception = assertThrows(IllegalArgumentException.class, () -> desafiosService.somar(0, 0));
        assertInstanceOf(IllegalArgumentException.class, exception);
    }


}
