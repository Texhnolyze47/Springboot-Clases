package com.example.springpatterns.patterns.structural.decorator;

import com.example.springpatterns.patterns.structural.decorator.decorador.EffectRetro;
import com.example.springpatterns.patterns.structural.decorator.decorador.EffectVintange;

public class Main {

    public static void main(String[] args) {

        // Se crea la foto original
        Photo selfie = new DigitalPhoto();
        System.out.println(selfie.show());

        // Se aplica un decorador a la foto original
        Photo selfieRetro = new EffectRetro(selfie);
        System.out.println(selfieRetro.show());

        Photo selfieVintange = new EffectVintange(selfie);
        System.out.println(selfieVintange.show());

        Photo selfieVintageRetro = new EffectRetro( new EffectVintange(selfie));
        System.out.println(selfieVintageRetro.show());

    }
}
