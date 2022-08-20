package com.example.obspringsecuritycifrado;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EncryptionTest {

    /**
     * BCrypt que genera su propio salt de 16 bytes
     * El resultado de cifrar con bcrypt será un String de 60 caracteres:
     * $a version
     * $10 fuerza
     */
    @Test
    void bcryptTest(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("admin");
        System.out.println(hashedPassword);

        boolean matches = passwordEncoder.matches("admin",hashedPassword);
        System.out.println(matches);
    }

    @Test
    void bcryptCheachMultiplePassword(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        for (int i = 0; i < 30; i++) {
            System.out.println(passwordEncoder.encode("admin"));
        }

    }

    @Test
    void pbkdf2(){
        Pbkdf2PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder();

        for (int i = 0; i < 30; i++) {
            System.out.println(passwordEncoder.encode("admin"));
        }
    }

    @Test
    void argon(){
        Argon2PasswordEncoder passwordEncoder = new Argon2PasswordEncoder();

        for (int i = 0; i < 30; i++) {
            System.out.println(passwordEncoder.encode("admin"));
        }
    }
    @Test
    void scrypt(){
        SCryptPasswordEncoder passwordEncoder = new SCryptPasswordEncoder();

        for (int i = 0; i < 30; i++) {
            System.out.println(passwordEncoder.encode("admin"));
        }
    }


    @Test
    void springPasswordEncoders(){

        Map<String, PasswordEncoder> encoders = new HashMap<>();

        encoders.put("bcrypt", new BCryptPasswordEncoder());

        PasswordEncoder passwordEncoder = new DelegatingPasswordEncoder("bcrypt",encoders);
    }

}
