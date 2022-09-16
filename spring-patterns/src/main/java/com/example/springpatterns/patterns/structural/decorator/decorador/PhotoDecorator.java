package com.example.springpatterns.patterns.structural.decorator.decorador;

import com.example.springpatterns.patterns.structural.decorator.Photo;

public abstract class PhotoDecorator extends Photo {

    protected Photo photo; // podria ser una foto real o un decorador porque ambos de Photo

    protected PhotoDecorator(Photo photo){
        super();
        this.photo = photo;
    }
}
