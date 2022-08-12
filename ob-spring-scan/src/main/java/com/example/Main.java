package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml" );
        //Concepto 1
        // Crear un objeto de forma normal
        // Calculadora service = new Calculadora();

        // Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        String texto = calculadora.holaMundo();
        System.out.println(texto);
        // Se puede volver a obtener
        // OJO: se recupera el mismo objeto
        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        texto = calculadora.holaMundo();
        System.out.println(texto);

        // Concepto 2: Cargar un bean dentro de un bean
        GestorFacturas gestorFacturas = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestorFacturas.calculadora.holaMundo());

        // Concepto 3: scope o alcance
        // los beans por defecto son singleton, se crea el objeto y se reutliza para toda la aplicacion
        // podemos cambiarlo a scape="prototype" si queremos se cree un nuevo objeto cada vez
        // verficarlo viendo como se ejecuta varias veces un constructor


    }
}
