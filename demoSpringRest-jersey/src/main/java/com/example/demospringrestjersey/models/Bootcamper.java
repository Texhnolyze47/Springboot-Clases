package com.example.demospringrestjersey.models;

//POJO => plain old java object
public class Bootcamper {

    private String nombre;

    public Bootcamper() {}

    public Bootcamper(String nombre) {  this.nombre = nombre;  }

    public String getNombre() {  return nombre;  }

    public void setNombre(String nombre) {  this.nombre = nombre;  }

}
