package com.example.springpatterns.patterns.behavioral.chain;

public abstract class AuthenticacionProcessor {

    //Este un manejador
    public AuthenticacionProcessor next;

    public  abstract  boolean isAuthorized(AuthenticacionProvider provider);
}
