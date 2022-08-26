package com.example.obspringsecuritycsrf.controller;

import com.example.obspringsecuritycsrf.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    /**
     * Este tipo controladores se utliza en tokens
     * y se utilizan para el intercambio de datos entre aplicaciones
     */


    @GetMapping("/api/hola")
    public String hola(){
        return "Hola mundo";
    }

    @GetMapping("/api/adios")
    public String adios(){
        return "Adios mundo";
    }

    @PostMapping("/api/users")
    public String save (@RequestBody UserDTO user){
        System.out.println(user);
        return "Ok";
    }
}
