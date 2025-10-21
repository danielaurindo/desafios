package com.example.desafios.unit.services;


import com.example.desafios.services.DesafiosService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDesafiosService {

    private final DesafiosService desafiosService = new DesafiosService();

    @Test
    void deveSomarDoisNumeros(){
        int resultado = desafiosService.somar(3, 2);
        assertEquals(5, resultado);
    }


}
