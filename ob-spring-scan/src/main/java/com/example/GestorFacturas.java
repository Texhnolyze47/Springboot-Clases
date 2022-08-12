package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    Calculadora calculadora;

    public GestorFacturas( Calculadora calculadora){
        System.out.println("Ejecutando constructor GestorFactura");
        this.calculadora = calculadora;
    }
}
