package com.example.springpatterns.patterns.structural.decorator.decorador;

import com.example.springpatterns.patterns.structural.decorator.Photo;

public class EffectVintange extends PhotoDecorator {

    public  EffectVintange (Photo photo){super(photo);}


    @Override
    public String show() {
        this.photo.setBrightness(90);
        this.photo.setContrast(20);
        this.photo.setBrightness(5);

        return this.photo.show() + " + Vintange";

    }

    @Override
    public double cost() {
        return this.photo.cost() + 15;
    }
}
