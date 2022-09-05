package com.example.demospringrestjersey.controllers;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class BootCampersController {

    @GET
    public String hola(){
        return "Hola";
    }
}
