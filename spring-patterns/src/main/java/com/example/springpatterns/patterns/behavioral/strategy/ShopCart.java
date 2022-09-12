package com.example.springpatterns.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShopCart  {

    private List <Product> products;


    public ShopCart() {
        this.products = new ArrayList<>();
    }

    public void addProducts(Product product){  this.addProducts(product);  }

    public void removeProducts(Product product){  this.removeProducts(product);  }



    public void pay(PaymentStrategy paymentMethod) {
        //opcion 1 iterar de forma funcional
        Double result = products.stream().map(x ->  x.getPrice()).reduce(Double::sum).orElse(0d);
        // opcion 2 iterar de forma imperativa
        double amount  = 0;
        for (Product product : products){
            amount += product.getPrice();
        }

        paymentMethod.pay(amount);

    }
}
