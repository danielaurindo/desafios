package com.example.desafios.utils;


public class ValidateRules {

    public static boolean checkBoletoCodigo(String boletoCodigo){
        return boletoCodigo != null && boletoCodigo.length() == 30;
    }
}
