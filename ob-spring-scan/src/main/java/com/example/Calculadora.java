package com.example;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Calculadora(){
        System.out.println("Ejecutar constructor de Calculator Service");
    }

    public String holaMundo(){
        return "Hola Mundo!";
    }

}
