package com.example.desafios.services.operadoreslogicos;

import com.example.desafios.interfaces.operadoreslogicos.DesafiosInterface;

public class DesafiosImpService implements DesafiosInterface {

    public int somar(int a, int b) {
        if(a == 0 && b == 0)
            throw new IllegalArgumentException("Divisão por zero não permitida");

        return a + b;
    }

}
