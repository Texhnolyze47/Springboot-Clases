package com.example.springpatterns.patterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        // preparar los datos
        ShopCart cart = new ShopCart();

        Product product1 = new Product("123456789DSFESF",9.99);
        Product product2 = new Product("123456789DSFESF",99.99);

        cart.addProducts(product1);
        cart.addProducts(product2);

        // Asignar estrategia
        cart.pay(new PaypalStrategy("","",""));
        cart.pay(new CreditCardStrategy(" ","  "," "," "));

        //Sí la interfaz tiene un solo metodo entonces es una interfaz funcional y por
        // tanto se puede utilizar lambdas, ahorrando asi tener que crear las implementaciones estrategia

        cart.pay(
                (amount ->  System.out.println(amount))
        );

    }
}
